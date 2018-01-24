package nz.co.trademe.property.uat.Tests.TestsForWL;

import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.LoginScreen;
import nz.co.trademe.property.uat.Screens.SaleResultsScreen;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class  AddToWLThenRemoveViaOverflow {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void addToWLThenRemoveViaOverflow() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.clickButtonSearch();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nz.co.trademe.property.uat:id/moreImageView")));

        SaleResultsScreen saleResults = new SaleResultsScreen(driver);
        saleResults.openOverflowMenu();
        saleResults.addToWL();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nz.co.trademe.property.uat:id/moreImageView")));


        Assert.assertTrue(saleResults.isWLIconDisplayed());

        saleResults.removeFromWLViaOverflow();

        Assert.assertTrue(driver.findElements(By.id("nz.co.trademe.property.uat:id/triangleImageView")).size() < 1);

    }

    @After
    public void quit() {

        driver.quit();
    }
}
