package nz.co.trademe.property.uat.Screens;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

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
    public MobileElement CardView;

    @AndroidFindBy(id = "content_view")
    private List<MobileElement> saleSearchResults;

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

    public void pullToRefresh()
    {



//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("direction", "down");
//        scrollObject.put("element", ((RemoteWebElement) element).getId());
//        js.executeScript("mobile: scroll", scrollObject);
    }


}
