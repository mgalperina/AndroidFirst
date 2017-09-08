package nz.co.trademe.property.uat.Screens;
import io.appium.java_client.AppiumDriver;
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

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SEARCH']")
    public MobileElement searchForRentButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Location']")
    public MobileElement locationSelectionButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Waikato']")
    public MobileElement locationWaikatoButton;

    @AndroidFindBy(id = "action_done")
    public MobileElement locationDoneButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rent' + 'per' + 'week']")
    public MobileElement rentPerWeekField;

    @AndroidFindBy(className = "android.widget.RelativeLayout")
    public MobileElement to500PriceSelection;

    @AndroidFindBy(id = "md_buttonDefaultPositive")
    public MobileElement okButtonRentPerWeek;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Property' + 'type']")
    public MobileElement propertyTypeField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Apartment']")
    public MobileElement apartmentCheckBox;

    @AndroidFindBy(id = "md_buttonDefaultPositive")
    public MobileElement okButtonPropertyType;



    public void clickButtonSearch()

    {
        searchForRentButton.click();
    }

    public void selectWaikatoLocation(){

        locationSelectionButton.click();
        locationWaikatoButton.click();
        locationDoneButton.click();
    }

    public void selectTo500Price() {

        rentPerWeekField.click();
        to500PriceSelection.sendKeys("$500");
        okButtonRentPerWeek.click();
    }

    public void selectApartmentPropertyTypeForRent(){

        propertyTypeField.click();
        apartmentCheckBox.click();
        okButtonPropertyType.click();
    }

}

