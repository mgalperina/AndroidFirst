package nz.co.trademe.property.uat.Tests.TestsForLoginPage;

import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.LoginScreen;
import nz.co.trademe.property.uat.Screens.MyAccountScreenLoggedIn;
import nz.co.trademe.property.uat.Screens.NavigationDrawer;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;

public class LogInThenCancelLogOut {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void logInThenCancelLogOut() {

        SearchForSaleScreen defaultScreen = new SearchForSaleScreen(driver);
        defaultScreen.openNavigationDrawer();

        NavigationDrawer navDrawer = new NavigationDrawer(driver);
        navDrawer.openMyAccountToLogIn();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");

        Assert.assertTrue(navDrawer.isLoggedIn());

        navDrawer.openMyAccountScreenWhileLoggedIn();

        MyAccountScreenLoggedIn myAccount = new MyAccountScreenLoggedIn(driver);
        myAccount.cancelLogOut();

        Assert.assertTrue(myAccount.isLoggedOut());

    }

    @After
    public void quit() {

        driver.quit();

    }
}
