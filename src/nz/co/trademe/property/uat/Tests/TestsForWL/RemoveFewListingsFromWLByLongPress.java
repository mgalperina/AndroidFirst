package nz.co.trademe.property.uat.Tests.TestsForWL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import nz.co.trademe.property.uat.Screens.*;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.text.DateFormat;
import java.time.Duration;

public class RemoveFewListingsFromWLByLongPress {

    AppiumDriver driver;
    Dimension size;
    String destDir;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }
//        NEED TO IMPLEMENT SCROLLING TO ADD TO WL THE 2ND LISTING!!!!!!!!!
    @Test
    public void removeFromWLTabByLongPress() {

          SearchForSaleScreen defaultScreen = new SearchForSaleScreen(driver);
          defaultScreen.clickButtonSearch();
//
          SaleResultsScreen saleResults = new SaleResultsScreen(driver);
//        saleResults.openOverflowMenu();
//        saleResults.addToWL();
//
//        LoginScreen loginScreen = new LoginScreen(driver);
//        loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");


//        driver.findElement(MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+"\").instance(0))");
//        saleResults.openOverflowMenu();
//        saleResults.addToWL();

//        size = driver.manage().window().getSize();
//        System.out.println(size);
//
        int starty = (int) (size.height * 0.10);
        int endy = (int) (size.height * 0.50);
        int startx = size.width / 2;
        //int endx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + ", startx = " + startx);

//        TouchAction touchAction = new TouchAction(driver);
//        new TouchAction(driver).press(startx, starty).waitAction(Duration.ofMillis(3)).moveTo(0, endy).release().perform();

        TouchAction action = new TouchAction(driver);
        action.press(startx, starty).moveTo(0, endy).perform().release();
        //touchAction.press(0, starty).moveTo(0, endy).perform();
        //new TouchAction(driver).press(startx, starty).waitAction(Duration.ofMillis(3)).moveTo(endx, endy).perform();

        //driver.findElement(new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().id("nz.co.trademe.property.uat:id/pager"))");

        //nz.co.trademe.property.uat:id/searchResultCell

        saleResults.openOverflowMenu();
        saleResults.addToWL();
//
//        saleResults.goBackToDefault();
//        defaultScreen.goToWLTab();
//
//        TouchAction action = new TouchAction(driver);
//        action.longPress(driver.findElement(By.id("nz.co.trademe.property.uat:id/imageview_main"))).release().perform();
//
//        WatchlistScreen wlScreen = new WatchlistScreen(driver);
//        wlScreen.deleteFromWL();
//
//        Assert.assertTrue(wlScreen.isThereAnyPropertyWatchlisted());

    }

    @After
    public void quit() {

        driver.quit();
    }
}
