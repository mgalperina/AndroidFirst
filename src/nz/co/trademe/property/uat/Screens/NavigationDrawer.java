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

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Search\")")
    public MobileElement searchButtonNavDrawer;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Insights\")")
    public MobileElement insightsButtonNavDrawer;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Watchlist\")")
    public MobileElement watchlistButtonNavDrawer;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"About\")")
    public MobileElement aboutButtonNavDrawer;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Send app feedback\")")
    public MobileElement sendFeedbackButtonNavDrawer;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Favourites\")")
    public MobileElement favouritesButtonNavDrawer;

    @AndroidFindBy(id = "gcfkgfv")
    public MobileElement gmailSubject;

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

    public void openSearchScreenFromNavDrawer()
    {
        searchButtonNavDrawer.click();
    }

    public void openInsightsScreenFromNavDrawer()
    {
        insightsButtonNavDrawer.click();
    }

    public void openWLScreenFromNavDrawer()
    {
        watchlistButtonNavDrawer.click();
    }

    public void openAboutScreenFromNavDrawer()
    {
        aboutButtonNavDrawer.click();
    }

    public void openFavsScreenFromNavDrawer()
    {
        favouritesButtonNavDrawer.click();
    }

    public void openFeedbackScreenFromNavDrawer()
    {
        sendFeedbackButtonNavDrawer.click();
    }

    public boolean isGmailOpen()
    {
        return gmailSubject.isDisplayed();
    }






}
