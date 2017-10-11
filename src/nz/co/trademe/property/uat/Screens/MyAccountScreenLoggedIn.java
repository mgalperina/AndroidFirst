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

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Hidden properties\")")
    public MobileElement hiddenPropertyField;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Confirm\")")
    public MobileElement restoreHiddenPropertyConfirmButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cancel\")")
    public MobileElement restoreHiddenPropertyCancelButton;

    @AndroidFindBy(xpath = "//android.support.v7.widget.LinearLayoutCompat[@index='2']")
    public MobileElement overflowMenuMyAcc;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Terms & Conditions\")")
    public MobileElement termsAndConditionsOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Privacy Policy\")")
    public MobileElement privacyPolicyOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Code of Conduct\")")
    public MobileElement codeOfConductOption;



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

    public boolean isHiddenPropertyThere()
    {
        return hiddenPropertyField.isDisplayed();
    }

    public void restoreHiddenProperties()
    {
        hiddenPropertyField.click();
        restoreHiddenPropertyConfirmButton.click();
    }

    public void cancelRestoreProperty()
    {
        hiddenPropertyField.click();
        restoreHiddenPropertyCancelButton.click();
    }

    public void openTermsAndConditionsLink()
    {
        overflowMenuMyAcc.click();
        termsAndConditionsOption.click();
    }

    public void openPrivacyPolicyLink()
    {
        overflowMenuMyAcc.click();
        privacyPolicyOption.click();
    }

    public void openCodeOfConductLink()
    {
        overflowMenuMyAcc.click();
        codeOfConductOption.click();
    }



}

