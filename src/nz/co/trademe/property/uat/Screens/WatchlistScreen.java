package nz.co.trademe.property.uat.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class WatchlistScreen {

    public AppiumDriver driver;

    public WatchlistScreen(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/fab")
    public MobileElement firstWatchlistedListing;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/delete_item")
    public MobileElement deleteFromWLButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    public MobileElement okToDeleteFromWLButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cancel\")")
    public MobileElement cancelToDeleteFromWLButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Nothing to see here, yet…\")")
    public MobileElement noWatchlistedListingsScreen;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"VIEWING TIMES\")")
    public MobileElement vtTabHeader;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/empty_text_message_textview")
    public MobileElement wlLegendNotLoggeIn;

    public void deleteFromWL()
    {
        deleteFromWLButton.click();
        okToDeleteFromWLButton.click();
    }

    public boolean isThereAnyPropertyWatchlisted()
    {
        return noWatchlistedListingsScreen.isDisplayed();
    }

    public void goToVT()
    {
        vtTabHeader.click();
    }

    public boolean isWLTabOpen()
    {
        return wlLegendNotLoggeIn.isDisplayed();
    }


}
