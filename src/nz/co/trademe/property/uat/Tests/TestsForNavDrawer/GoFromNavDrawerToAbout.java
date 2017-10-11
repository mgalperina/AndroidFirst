package nz.co.trademe.property.uat.Tests.TestsForNavDrawer;

import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.*;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class GoFromNavDrawerToAbout {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void goFromNavDrawerToAbout() {

        SearchForSaleScreen defaultScreen = new SearchForSaleScreen(driver);
        defaultScreen.openNavigationDrawer();

        NavigationDrawer navDrawer = new NavigationDrawer(driver);
        navDrawer.openAboutScreenFromNavDrawer();

        AboutScreen about = new AboutScreen(driver);
        Assert.assertTrue(about.isAboutPageOpen());

    }

    @After
    public void quit() {

        driver.quit();
    }
}
