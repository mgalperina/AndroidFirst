package nz.co.trademe.property.uat.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class NavigationDrawer {

    public AppiumDriver driver;

    public NavigationDrawer(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"to Trade Me Property\")")
    public MobileElement myAccountFieldLoggedOut;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"My account\")")
    public MobileElement myAccountFieldLoggedIn;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/textViewNavItemLink")
    public MobileElement searchButtonNavDrawer;

    public void openMyAccountToLogIn()
    {
        myAccountFieldLoggedOut.click();
    }

    public void openMyAccountScreenWhileLoggedIn() {myAccountFieldLoggedIn.click();}

    public boolean isLoggedIn()
    {
        return myAccountFieldLoggedIn.getText().toString().contains("My account");
    }

    public void clickSearchButtonFromNavDrawer()
    {
        searchButtonNavDrawer.click();
    }

    public boolean isLoggedOut() { return myAccountFieldLoggedOut.getText().toString().contains("to Trade Me");}




}
