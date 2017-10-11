package nz.co.trademe.property.uat.Tests.TestsForNavDrawer;

import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.FavouritesScreen;
import nz.co.trademe.property.uat.Screens.InsightsScreen;
import nz.co.trademe.property.uat.Screens.NavigationDrawer;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class GoFromNavDrawerToInsights {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void goFromNavDrawerToInsights() {

        SearchForSaleScreen defaultScreen = new SearchForSaleScreen(driver);
        defaultScreen.openNavigationDrawer();

        NavigationDrawer navDrawer = new NavigationDrawer(driver);
        navDrawer.openInsightsScreenFromNavDrawer();

        InsightsScreen insights = new InsightsScreen(driver);
        Assert.assertTrue(insights.isInsightsPageOpen());

    }

    @After
    public void quit() {

        driver.quit();
    }
}
