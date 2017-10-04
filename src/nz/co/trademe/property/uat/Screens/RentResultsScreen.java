package nz.co.trademe.property.uat.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class RentResultsScreen {

        public AppiumDriver driver;

        public RentResultsScreen(AppiumDriver driver) {
            this.driver = driver;

            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        }

        @AndroidFindBy(id = "count_textview")
        public MobileElement rentResultsTitle;

        @AndroidFindBy(xpath = "//android.widget.TextView[@text='Map']")
        public MobileElement mapTabButtonRentResults;

       @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Properties for rent\")")
       public MobileElement rentResultsHeader;




    public boolean isRentalsHeaderCorrect()
    {
        return rentResultsHeader.getText().toString().equals("Properties for rent");
    }

        public void clickMapTabRentResults()
        {
            mapTabButtonRentResults.click();
        }
}
