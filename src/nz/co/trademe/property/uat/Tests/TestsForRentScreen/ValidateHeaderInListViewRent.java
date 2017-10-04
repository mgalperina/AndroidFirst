package nz.co.trademe.property.uat.Tests.TestsForRentScreen;
import nz.co.trademe.property.uat.Screens.*;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;

public class ValidateHeaderInListViewRent {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void validateHeaderInListViewRent() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.clickToRentTab();

        SearchForRentScreen searchForRentScreen = new SearchForRentScreen(driver);
        searchForRentScreen.clickButtonSearch();

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.(MobileElement, "rentToolbar"));


        RentResultsScreen rentResultsScreen = new RentResultsScreen(driver);
        Assert.assertTrue(rentResultsScreen.isRentalsHeaderCorrect());

    }


    @After
    public void quit() {

        driver.quit();

    }
}