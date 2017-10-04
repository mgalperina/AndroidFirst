package nz.co.trademe.property.uat.Tests.GeneralChecksSuite;

import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.*;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class LoginThenClickSearchToRent {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void loginThenClickSearchToRent() {

        SearchForSaleScreen defaultScreen = new SearchForSaleScreen(driver);
        defaultScreen.openNavigationDrawer();

        NavigationDrawer navDrawer = new NavigationDrawer(driver);
        navDrawer.openMyAccountToLogIn();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");

        navDrawer.clickSearchButtonFromNavDrawer();
        defaultScreen.clickToRentTab();

        SearchForRentScreen searchForRentScreen = new SearchForRentScreen(driver);
        searchForRentScreen.clickButtonSearch();

        RentResultsScreen rentResultsScreen = new RentResultsScreen(driver);
        Assert.assertTrue(rentResultsScreen.isRentalsHeaderCorrect());

    }


    @After
    public void quit() {

        driver.quit();

    }
}
