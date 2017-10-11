package nz.co.trademe.property.uat.Tests.TestsForWL;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.selenium.Eyes;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.RentResultsScreen;
import nz.co.trademe.property.uat.Screens.SearchForRentScreen;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Screens.WatchlistScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;

public class ValidateHeaderForVTApplitools {

    AppiumDriver driver;
    Eyes eyes = new Eyes();
    BufferedImage img;
    BatchInfo batch = new BatchInfo("Viewing Tracker");
    private static String applitoolsKey = "ot2JU3SX23eeTkHdRGGqin94a3uFVhUF1UjRSu0h5zk110";



    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void validateHeaderForVTApplitools() {

        eyes.setApiKey(applitoolsKey);
        eyes.setBatch(batch);

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.goToWLTab();

        WatchlistScreen wlScreen = new WatchlistScreen(driver);
        wlScreen.goToVT();

        eyes.open(driver, "TMProperty", "ValidateVTHeader");
        eyes.checkWindow("VTHeader");
        eyes.close();


    }


    @After
    public void quit() {

        driver.quit();
        eyes.abortIfNotClosed();
    }
}
