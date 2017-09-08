package nz.co.trademe.property.uat.Screens;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class SaleResultsScreen {

    public AppiumDriver driver;

    public SaleResultsScreen(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "count_textview")
    public MobileElement saleResultsTitle;





    public boolean areSearchResultsLoaded()
    {
        return saleResultsTitle.getText().toString().contains("Sorted by");
    }
}
