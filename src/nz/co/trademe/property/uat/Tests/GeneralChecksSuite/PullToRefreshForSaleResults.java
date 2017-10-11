package nz.co.trademe.property.uat.Tests.GeneralChecksSuite;
import io.appium.java_client.TouchAction;
import nz.co.trademe.property.uat.Screens.*;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class PullToRefreshForSaleResults {

    AppiumDriver driver;
    Dimension size;
    String destDir;
    DateFormat dateFormat;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void pullToRefreshForSaleResults() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.clickButtonSearch();

        SaleResultsScreen saleResults = new SaleResultsScreen(driver);

        size = driver.manage().window().getSize();
        System.out.println(size);

        int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.70);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + ", startx = " + startx);

//THIS IMPLEMENTATION IS NOT WORKING!!!
        new TouchAction(driver).press(startx, starty).waitAction(Duration.ofMillis(3)).moveTo(0, endy).release().perform();

        takeScreenShot();

        //HOW TO ASSERT A SPINNER???
//        Assert.assertTrue(defaultSearch.isDefaultTabOpen());
    }

    public void takeScreenShot()
    {
        destDir = "screenshots";
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        new File(destDir).mkdirs();
        String destFile = dateFormat.format(new Date()) + " .png";

        try {
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
        }catch (IOException e) {
            e.printStackTrace();

        }
    }


    @After
    public void quit() {

        driver.quit();
    }
}
