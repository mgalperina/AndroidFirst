package nz.co.trademe.property.uat.Tests.GeneralChecksSuite;
import nz.co.trademe.property.uat.Screens.*;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;

public class PullToRefreshForSaleResults {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void pullToRefreshForSaleResults() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.clickButtonSearch();

        //retry that with real device!!!need to resolve swipe call and put normal coordinates
//        SaleResultsScreen saleResults = new SaleResultsScreen(driver);
//        driver.swipe(20,492,113, -600,100);
//        saleResults.pullToRefresh();



//        public void swipeDown (AppiumDriver driver) throws InterruptedException
//    {
//            Dimension size = driver.manage().window().getSize();
//            System.out.println(size);
//
//            int start = (int) (size.height * 0.80);
//
//            int end = (int) (size.height * 0.65);
//
//            int startx = size.width / 2;
//            System.out.println("starty = " + start + " ,endy = " + end + " , startx = " + startx);
//
//            //Swipe from Bottom to Top.
//            driver.swipe(startx, end, startx, start, 1000);
//    }


        Assert.assertTrue(defaultSearch.isDefaultTabOpen());

    }


    @After
    public void quit() {

        driver.quit();
    }
}
