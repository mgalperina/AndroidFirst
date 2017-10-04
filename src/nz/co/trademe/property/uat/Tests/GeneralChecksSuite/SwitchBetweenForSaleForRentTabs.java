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
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.UUID;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchBetweenForSaleForRentTabs {

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
    public void switchBetweenForSaleForRentTabs() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);

        defaultSearch.clickToRentTab();

        SearchForRentScreen searchForRentScreen = new SearchForRentScreen(driver);
        Assert.assertTrue(searchForRentScreen.isRentTabOpen());
        takeScreenShot();

        searchForRentScreen.clickForSaleTab();
        Assert.assertTrue(defaultSearch.isDefaultTabOpen());
        takeScreenShot();

//        size = driver.manage().window().getSize();
//        System.out.println(size);
//
//        int starty = size.height / 3;
//        int starty = (int) (size.height * 0.43);
//        int startx = (int) (size.width * 0.80);
//        int endx = (int) (size.width * 0.20);
//        System.out.println("startx = " + startx + " ,endx = " + endx + ", starty = " + starty);
//
//        new TouchAction(driver).press(startx, starty).waitAction(Duration.ofMillis(1)).moveTo(startx, endx).release().perform();
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
