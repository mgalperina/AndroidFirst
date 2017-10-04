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

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='To rent']")
    public MobileElement toRentScreenButton;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='5']")
    public MobileElement openHomesToggle;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index = '1']")
    public MobileElement priceField;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/toolbar_search")
    public MobileElement toolbarForSale;

//    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/numberPicker")
//    public MobileElement fromPriceSelection;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/numberPickerMax")
    public MobileElement toPriceSelection;

    @AndroidFindBy(uiAutomator = "id/numberPicker")
    public MobileElement fromPriceSelection;

//    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@text = 'Any'][0]")
//    public MobileElement fromPriceSelection;

//    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@id = 'content']//android.widget.NumberPicker[@id = 'numberPicker']")
//    public MobileElement fromPriceSelection;


    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/md_buttonDefaultPositive")
    public MobileElement okButtonPrice;

    @AndroidFindBy(className = "android.widget.ImageButton")
    public MobileElement navigationDrawerButton;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/md_customViewFrame")
    public MobileElement price;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/md_customViewFrame")
    public MobileElement fieldToTapToGetRidOfNavDrawer;

//@id = 'nz.co.trademe.property.uat:id/md_customViewFrame'

    public void clickButtonSearch()

    {
        searchForSaleButton.click();
    }


    public void clickToRentTab() { toRentScreenButton.click();}


    public boolean isDefaultTabOpen() {

        return openHomesToggle.isDisplayed();
    }

    public void selectPriceFrom(String fromPrice)

    {
        priceField.click();
        price.click();
        fromPriceSelection.sendKeys(fromPrice);
        //fromPriceSelection.setValue(fromPrice);
        okButtonPrice.click();
    }

    public void switchOpenHomesToggle()
    {
        openHomesToggle.click();
    }

    public void openNavigationDrawer()
    {
        navigationDrawerButton.click();
    }

    public void clickPriceSelection()
    {
        priceField.click();
        okButtonPrice.click();
    }

}