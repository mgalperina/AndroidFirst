package nz.co.trademe.property.uat.Tests.TestsForRentScreen;
import nz.co.trademe.property.uat.Screens.*;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;

public class ValidateHeaderInMapViewRent {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void validateHeaderInMapViewRent() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.clickToRentTab();

        SearchForRentScreen searchForRentScreen = new SearchForRentScreen(driver);
        searchForRentScreen.clickButtonSearch();

        RentResultsScreen rentResultsScreen = new RentResultsScreen(driver);
        rentResultsScreen.clickMapTabRentResults();

        Assert.assertTrue(rentResultsScreen.isHeaderCorrect());


        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sorted by")));

    }


    @After
    public void quit() {

        driver.quit();
    }
}
