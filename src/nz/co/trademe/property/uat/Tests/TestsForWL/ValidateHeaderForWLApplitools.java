package nz.co.trademe.property.uat.Tests.TestsForWL;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.selenium.Eyes;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;

public class ValidateHeaderForWLApplitools {

    AppiumDriver driver;
    Eyes eyes = new Eyes();
    BufferedImage img;
    BatchInfo batch = new BatchInfo("Watchlist");
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

        eyes.open(driver, "TMProperty", "ValidateWLHeader");
        eyes.checkWindow("WLHeader");
        eyes.close();


    }


    @After
    public void quit() {

        driver.quit();
        eyes.abortIfNotClosed();
    }
}
