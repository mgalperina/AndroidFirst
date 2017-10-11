package nz.co.trademe.property.uat.Tests.TestsForRentScreen;
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

public class ValidateToRentScreenApplitools {

    AppiumDriver driver;
    Eyes eyes = new Eyes();
    BufferedImage img;
    BatchInfo batch = new BatchInfo("nz.co.trademe.property.uat");
    private static String applitoolsKey = "ot2JU3SX23eeTkHdRGGqin94a3uFVhUF1UjRSu0h5zk110";


    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void validateToRentScreenApplitools() {

        eyes.setApiKey(applitoolsKey);
        eyes.setBatch(batch);

        SearchForSaleScreen defaultScreen = new SearchForSaleScreen(driver);
        defaultScreen.clickToRentTab();

        eyes.open(driver, "TMProperty", "ValidateToRentUITest");
        eyes.checkWindow("ToRentUI");
        eyes.close();
    }

    @After
    public void quit() {

        driver.quit();
        eyes.abortIfNotClosed();

    }
}
