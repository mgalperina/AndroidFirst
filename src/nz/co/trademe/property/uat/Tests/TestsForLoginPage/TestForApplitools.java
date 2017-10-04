package nz.co.trademe.property.uat.Tests.TestsForLoginPage;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.LoginScreen;
import nz.co.trademe.property.uat.Screens.NavigationDrawer;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

public class TestForApplitools {
    AppiumDriver driver;
    Eyes eyes = new Eyes();
    BufferedImage img;


    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void testForApplitools() {

        SearchForSaleScreen defaultScreen = new SearchForSaleScreen(driver);
        defaultScreen.openNavigationDrawer();

        NavigationDrawer navDrawer = new NavigationDrawer(driver);
        navDrawer.openMyAccountToLogIn();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.mnz", "BumbleBee");
        eyes.setApiKey("ot2JU3SX23eeTkHdRGGqin94a3uFVhUF1UjRSu0h5zk110");
        eyes.checkImage("Initial");

        loginScreen.logIn("mariia.galperina@trademe.co.mnz", "BumbleBee");
        eyes.checkImage("After");


        //eyes.open("nz.co.trademe.property", "LoginPage", new RectangleSize(768, 1184));
//            eyes.open("nz.co.trademe.property", "LoginPagee", new RectangleSize((driver.get)))
        //img = ImageIO.read(new URL(""));
        //  eyes.checkImage(img, "LoginFailed");
        eyes.close();
    }
        @After
        public void quit() {

            driver.quit();
            eyes.abortIfNotClosed();


        }
    }

