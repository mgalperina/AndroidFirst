package nz.co.trademe.property.uat.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AboutScreen {

    public AppiumDriver driver;

    public AboutScreen(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"App Version\")")
    public MobileElement appVersionField;

    public boolean isAboutPageOpen()

    {
        return appVersionField.isDisplayed();
    }
}
