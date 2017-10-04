package nz.co.trademe.property.uat.Tests;
import nz.co.trademe.property.uat.Screens.*;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;

public class SearchForRentWaikatoTo500Apartment {
    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void searchForSaleWaikatoTo500Apartment() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.clickToRentTab();

        SearchForRentScreen searchForRentScreen = new SearchForRentScreen(driver);
        searchForRentScreen.selectLocation("Auckland");
        searchForRentScreen.selectToPrice("$500");
        searchForRentScreen.selectPropertyTypeForRent("Apartment");
        searchForRentScreen.clickButtonSearch();

//        Assert.assertTrue(searchForRentScreen.areSearchResultsLoaded());
//        Assert.assertTrue(searchForRentScreen.areSearchResultsLoaded());
//        Assert.assertTrue(searchForRentScreen.areSearchResultsLoaded());

    }


    @After
    public void quit() {

        driver.quit();
    }
}
