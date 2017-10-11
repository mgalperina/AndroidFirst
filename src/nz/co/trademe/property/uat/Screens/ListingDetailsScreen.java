package nz.co.trademe.property.uat.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ListingDetailsScreen {

    public AppiumDriver driver;

    public ListingDetailsScreen(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/fab")
    public MobileElement fabButton;



    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement backButtonListing;




    public void addToWLviaFAB ()
    {
        fabButton.click();
    }

    public void goBackToSearchResults()
    {
        backButtonListing.click();
    }

}
