//package nz.co.trademe.property.uat.Tests.TestsForLoginPage;
//
//import com.applitools.eyes.selenium.Eyes;
//import com.applitools.eyes.RectangleSize;
//import io.appium.java_client.AppiumDriver;
//import nz.co.trademe.property.uat.Screens.LoginScreen;
//import nz.co.trademe.property.uat.Screens.NavigationDrawer;
//import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
//import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import java.awt.image.BufferedImage;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class TestForApplitools {
//    AppiumDriver driver;
//    Eyes eyes = new Eyes();
//    BufferedImage img;
//
//
//    @Before
//    public void setup() throws MalformedURLException {
//        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
//        driver = driverBuilder.CreateDriver();
//
//    }
//
//    @Test
//    public void testForApplitools() {
//
//        SearchForSaleScreen defaultScreen = new SearchForSaleScreen(driver);
//        defaultScreen.openNavigationDrawer();
//
//        NavigationDrawer navDrawer = new NavigationDrawer(driver);
//        navDrawer.openMyAccountToLogIn();
//
//        LoginScreen loginScreen = new LoginScreen(driver);
//        eyes.setApiKey("ot2JU3SX23eeTkHdRGGqin94a3uFVhUF1UjRSu0h5zk110");
//        eyes.open(driver, "TMProperty", "TestInvalidLogIn");
//        loginScreen.enterCredentials("mariia.galperina@trademe.co.mnz", "BumbleBee");
//        loginScreen.clickLogInButton();
//        eyes.checkWindow("Initial1");
//
//        eyes.close();
//    }
//        @After
//        public void quit() {
//
//            driver.quit();
//            eyes.abortIfNotClosed();
//
//
//        }
//    }

