package nz.co.trademe.property.uat.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MyAccountScreenLoggedIn {

    public AppiumDriver driver;

    public MyAccountScreenLoggedIn(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log out\")")
    public MobileElement logOutButton;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/primary_textview")
    public MobileElement contactUsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Confirm\")")
    public MobileElement logOutPopUpConfirm;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement logOutPopUpCancel;

    public void logOut()
    {
        logOutButton.click();
        logOutPopUpConfirm.click();
    }

    public void cancelLogOut()
    {
        logOutButton.click();
        logOutPopUpCancel.click();
    }

    public boolean isLoggedOut() {
        return logOutButton.isDisplayed();
    }
}

