package nz.co.trademe.property.uat.Screens;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {

    public AppiumDriver driver;

    public LoginScreen(AppiumDriver driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/edit_text_email")
    public MobileElement emailField;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/edit_text_password")
    public MobileElement passwordField;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/button_login")
    public MobileElement logInButton;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/image_logo")
    public MobileElement logInPageLogo;

    public void logIn(String email, String password)
    {
        emailField.click();
        emailField.sendKeys(email);
        passwordField.click();
        passwordField.sendKeys(password);
        logInButton.click();
    }

    public boolean isNotLoggedIn()
    {
        return logInPageLogo.isDisplayed();
    }

    public void enterCredentials(String email, String password)
    {
        emailField.click();
        emailField.sendKeys(email);
        passwordField.click();
        passwordField.sendKeys(password);
    }

    public void clickLogInButton()
    {
        logInButton.click();
    }

}


