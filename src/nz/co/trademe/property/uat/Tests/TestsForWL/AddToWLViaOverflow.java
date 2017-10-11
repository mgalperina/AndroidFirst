package nz.co.trademe.property.uat.Tests.TestsForWL;

import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.LoginScreen;
import nz.co.trademe.property.uat.Screens.SaleResultsScreen;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;

public class AddToWLViaOverflow {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void addToWLViaOverflow() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.clickButtonSearch();

        SaleResultsScreen saleResults = new SaleResultsScreen(driver);
        saleResults.openOverflowMenu();
        saleResults.addToWL();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");

        Assert.assertTrue(saleResults.isWLIconDisplayed());

        saleResults.removeFromWLViaOverflow();

    }

    @After
    public void quit() {

        driver.quit();
    }
}
