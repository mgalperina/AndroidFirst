package nz.co.trademe.property.uat.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FavouritesScreen {

    public AppiumDriver driver;

    public FavouritesScreen(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/empty_text_message_textview")
    public MobileElement favsLegendNotLoggedIn;

    public boolean isFavsPageOpen()
    {
        return favsLegendNotLoggedIn.isDisplayed();
    }


}
