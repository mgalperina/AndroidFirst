package nz.co.trademe.property.uat.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchForSaleScreen {

    public AppiumDriver driver;

    public SearchForSaleScreen(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SEARCH']")
    public MobileElement searchForSaleButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TO RENT']")
    public MobileElement toRentScreenButton;



    public void clickButtonSearch()

    {
        searchForSaleButton.click();
    }


    public void clickToRentTab() { toRentScreenButton.click();}


    /*public boolean isStartingPageOpened() {

        return textAboutFB.getText().toString().contains("We do NOT post anything to Facebook");
    }*/



}