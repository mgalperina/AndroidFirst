package nz.co.trademe.property.uat.Tests.TestsForHiding;

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

public class HideListingBeingLoggedIn {
    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void hideListingBeingLoggedIn() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.openNavigationDrawer();

        NavigationDrawer navdrawer = new NavigationDrawer(driver);
        navdrawer.openMyAccountToLogIn();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nz.co.trademe.property.uat:id/search_item")));

        navdrawer.clickSearchButtonFromNavDrawer();
        defaultSearch.clickButtonSearch();

        SaleResultsScreen saleResults = new SaleResultsScreen(driver);
        saleResults.hideListing();

        saleResults.goBackToDefault();
        defaultSearch.openNavigationDrawer();
        navdrawer.openMyAccountScreenWhileLoggedIn();

        MyAccountScreenLoggedIn myAcc = new MyAccountScreenLoggedIn(driver);
        Assert.assertTrue(myAcc.isHiddenPropertyThere());
        System.out.println("That hidden property has been hidden");

        myAcc.restoreHiddenProperties();
        System.out.println("Now this property has been restored");
    }

    @After
    public void quit() {

        driver.quit();
    }
}
