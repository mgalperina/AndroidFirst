package nz.co.trademe.property.uat.Tests.TestsForWL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import nz.co.trademe.property.uat.Screens.LoginScreen;
import nz.co.trademe.property.uat.Screens.SaleResultsScreen;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Screens.WatchlistScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import java.net.MalformedURLException;

public class RemoveFromWLTabByLongPress {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void removeFromWLTabByLongPress() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.clickButtonSearch();

        SaleResultsScreen saleResults = new SaleResultsScreen(driver);
        saleResults.openOverflowMenu();
        saleResults.addToWL();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");

        Assert.assertTrue(saleResults.isWLIconDisplayed());

        saleResults.goBackToDefault();
        defaultSearch.goToWLTab();

        TouchAction action = new TouchAction(driver);
        action.longPress(driver.findElement(By.id("nz.co.trademe.property.uat:id/imageview_main"))).release().perform();

        WatchlistScreen wlScreen = new WatchlistScreen(driver);
        wlScreen.deleteFromWL();

        Assert.assertTrue(wlScreen.isThereAnyPropertyWatchlisted());

    }

    @After
    public void quit() {

        driver.quit();
    }
}
