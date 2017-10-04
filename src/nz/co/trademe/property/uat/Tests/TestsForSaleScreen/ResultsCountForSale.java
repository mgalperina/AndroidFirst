package nz.co.trademe.property.uat.Tests.TestsForSaleScreen;
import io.appium.java_client.MobileElement;
import nz.co.trademe.property.uat.Screens.*;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.List;

public class ResultsCountForSale {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void resultsCountForSale() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.switchOpenHomesToggle();
        //defaultSearch.clickPriceSelection();
        defaultSearch.selectPriceFrom("$5M"); //FIND PROPER LOCATOR!!!!!!
        defaultSearch.clickButtonSearch();

        SaleResultsScreen saleResults = new SaleResultsScreen(driver);
        //saleResults.getResultsCount();

        List<MobileElement> searchResultsTable = driver.findElements(By.id("content_view"));
        int cardsCount = searchResultsTable.size();

        for(int row=0;row<cardsCount; row++) {

            System.out.println("Number of cards in this search result is " +cardsCount);
        }

//    public int CalculateSum() {
//        int elementsInTable = driver.findElements(By.id("content_view")).size();
//        int sum = 0;
//        for (String element : elementsInTable)
//        {
//            int value = int.parse(element.Text);
//            sum = sum + value;
//        }
//
//        return sum;
//    }


        //Assert.assertTrue(saleResults.);


    }


    @After
    public void quit() {

        driver.quit();
    }
}
