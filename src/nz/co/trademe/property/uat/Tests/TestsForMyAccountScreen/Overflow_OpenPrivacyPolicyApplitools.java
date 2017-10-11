package nz.co.trademe.property.uat.Tests.TestsForMyAccountScreen;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.selenium.Eyes;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.LoginScreen;
import nz.co.trademe.property.uat.Screens.MyAccountScreenLoggedIn;
import nz.co.trademe.property.uat.Screens.NavigationDrawer;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;

public class Overflow_OpenPrivacyPolicyApplitools {

    AppiumDriver driver;
    Eyes eyes = new Eyes();
    BufferedImage img;
    BatchInfo batch = new BatchInfo("PrivacyPolicy");
    private static String applitoolsKey = "ot2JU3SX23eeTkHdRGGqin94a3uFVhUF1UjRSu0h5zk110";

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void overflow_OpenPrivacyPolicyApplitools() {

        eyes.setApiKey(applitoolsKey);
        eyes.setBatch(batch);

        SearchForSaleScreen defaultScreen = new SearchForSaleScreen(driver);
        defaultScreen.openNavigationDrawer();

        NavigationDrawer navDrawer = new NavigationDrawer(driver);
        navDrawer.openMyAccountToLogIn();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");

        MyAccountScreenLoggedIn myAcc = new MyAccountScreenLoggedIn(driver);
        navDrawer.openMyAccountScreenWhileLoggedIn();
        myAcc.openPrivacyPolicyLink();

        eyes.open(driver, "TMProperty", "ValidatePrivacyPage");
        eyes.checkWindow("PrivacyUI");
        eyes.close();

    }


    @After
    public void quit() {

        driver.quit();
        eyes.abortIfNotClosed();
    }
}
