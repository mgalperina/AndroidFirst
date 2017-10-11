package nz.co.trademe.property.uat.Screens;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.NoSuchElementException;

public class SaleResultsScreen {

    public AppiumDriver driver;

    public SaleResultsScreen(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "count_textview")
    public MobileElement saleResultsTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Properties for sale\")")
    public MobileElement saleResultsHeader;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Map']")
    public MobileElement mapTabButtonSaleResults;

    @AndroidFindBy(id = "search_result_cell")
    public MobileElement cardView;

    @AndroidFindBy(id = "content_view")
    private List<MobileElement> saleSearchResults;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/moreImageView")
    public MobileElement overflowMenuSaleCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add to Watchlist\")")
    public MobileElement overflowAddtoWL;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/triangleImageView")
    public MobileElement wlIconOnCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Remove from Watchlist\")")
    public MobileElement removeFromWLOverflow;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/mainImageView")
    public MobileElement listingGeneralField;

    @AndroidFindBy(className = "android.widget.ImageButton")
    public MobileElement backButtonSearchResults;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Hide listing\")")
    public MobileElement hideListingButton;

    public int resultsCount()
    {
        return saleSearchResults.size();
    }

    public boolean areSearchResultsLoaded()
    {
        return saleResultsTitle.getText().toString().contains("Sorted by");
    }

    public boolean isSaleHeaderCorrect()
    {
        return saleResultsHeader.getText().toString().equals("Properties for sale");
    }

    public void clickMapTabSaleResults()
    {
        mapTabButtonSaleResults.click();
    }

    public MobileElement getResultsCount(int index)
    {
        return saleSearchResults.get(index);
    }

    public void openOverflowMenu() {overflowMenuSaleCard.click();}

    public void addToWL() {overflowAddtoWL.click();}

    public boolean isWLIconDisplayed() {
        return wlIconOnCard.isDisplayed();
    }

    public void removeFromWLViaOverflow()
    {
        overflowMenuSaleCard.click();
        removeFromWLOverflow.click();
    }

    public void openFirstListing()
    {
        listingGeneralField.click();
    }

    public void pullToRefresh()
    {



//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("direction", "down");
//        scrollObject.put("element", ((RemoteWebElement) element).getId());
//        js.executeScript("mobile: scroll", scrollObject);
    }

   public void goBackToDefault()
   {
       backButtonSearchResults.click();
   }

   public void hideListing()
   {
       overflowMenuSaleCard.click();
       hideListingButton.click();
   }

}
