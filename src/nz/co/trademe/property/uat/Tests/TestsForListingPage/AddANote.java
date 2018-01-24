package nz.co.trademe.property.uat.Tests.TestsForListingPage;

import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.*;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class AddANote {

        AppiumDriver driver;

        @Before
        public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

        }

        @Test
        public void addANote() {

            SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
            defaultSearch.clickButtonSearch();

            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nz.co.trademe.property.uat:id/moreImageView")));

            SaleResultsScreen saleResults = new SaleResultsScreen(driver);
            saleResults.openFirstListing();

            ListingDetailsScreen listingDetails = new ListingDetailsScreen(driver);
            listingDetails.openNote();

            LoginScreen loginScreen = new LoginScreen(driver);
            loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nz.co.trademe.property.uat:id/note_edittext")));

            listingDetails.createANote("test");

            listingDetails.openNote();

            Assert.assertTrue(listingDetails.isANoteSaved("test"));
        }


        @After
        public void quit() {

            driver.quit();
        }

}
