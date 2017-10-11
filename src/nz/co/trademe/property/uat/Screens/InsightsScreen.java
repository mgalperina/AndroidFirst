package nz.co.trademe.property.uat.Screens;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class InsightsScreen {

    public AppiumDriver driver;

    public InsightsScreen(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Property Insights\")")
    public MobileElement insightsHeader;

    public boolean isInsightsPageOpen()
    {
        return insightsHeader.isDisplayed();
    }
}
