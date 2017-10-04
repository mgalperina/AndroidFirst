package nz.co.trademe.property.uat.Screens;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchForRentScreen {

    public AppiumDriver driver;

    public SearchForRentScreen(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "search_button_container")
    public MobileElement searchForRentButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Location']")
    public MobileElement locationSelectionButton;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Waikato']")
//    public MobileElement regionSelectionButton;

    @AndroidFindBy(id = "list")
    public MobileElement regionSelectionList;

    @AndroidFindBy(id = "action_done")
    public MobileElement locationDoneButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rent per week']")
    public MobileElement rentPerWeekField;

    @AndroidFindBy(id = "numberPickerMax")
    public MobileElement toPriceSelection;

    @AndroidFindBy(id = "md_buttonDefaultPositive")
    public MobileElement okButtonRentPerWeek;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Property' + 'type']")
    public MobileElement propertyTypeField;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='2']")
    public MobileElement propertyTypeCheckBox;

    @AndroidFindBy(id = "md_buttonDefaultPositive")
    public MobileElement okButtonPropertyType;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index = '5']")
    public MobileElement petsOkToggle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='For sale']")
    public MobileElement forSaleTab;



    public void clickButtonSearch()

    {
        searchForRentButton.click();
    }

    public void selectLocation(String region)
    {

        locationSelectionButton.click();
        regionSelectionList.sendKeys(region);
        locationDoneButton.click();
    }

    public void selectToPrice(String toPrice) {

        rentPerWeekField.click();
        toPriceSelection.sendKeys(toPrice);
        okButtonRentPerWeek.click();
    }

    public void selectPropertyTypeForRent(String propertyType)
    {
        propertyTypeField.click();
        propertyTypeCheckBox.sendKeys(propertyType);
        okButtonPropertyType.click();
    }

    public boolean isRentTabOpen()
    {
        return petsOkToggle.isDisplayed();
    }

    public void clickForSaleTab()
    {
        forSaleTab.click();
    }

}

