package nz.co.trademe.property.uat.Tests.TestsForHiding;

import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.*;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;

public class HideListingBeingLoggedOut {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void hideListingBeingLoggedOut() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.clickButtonSearch();

        SaleResultsScreen saleResults = new SaleResultsScreen(driver);
        saleResults.hideListing();

        saleResults.goBackToDefault();
        defaultSearch.openNavigationDrawer();

        NavigationDrawer navdrawer = new NavigationDrawer(driver);
        navdrawer.openMyAccountToLogIn();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");

        navdrawer.openMyAccountScreenWhileLoggedIn();

        MyAccountScreenLoggedIn myAcc = new MyAccountScreenLoggedIn(driver);
        Assert.assertTrue(myAcc.isHiddenPropertyThere());


        myAcc.restoreHiddenProperties();
    }

    @After
    public void quit() {

        driver.quit();
    }
}
