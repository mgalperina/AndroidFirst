package nz.co.trademe.property.uat.Screens;

import cucumber.api.java.en.And;
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

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/left_button_text")
    public MobileElement addNoteButton;

    @AndroidFindBy(id = "nz.co.trademe.property.uat:id/note_edittext")
    public MobileElement noteFieldEditMode;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
    public MobileElement saveNoteButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Edit\")")
    public MobileElement editANoteButton;


    public void addToWLviaFAB ()
    {
        fabButton.click();
    }

    public void goBackToSearchResults()
    {
        backButtonListing.click();
    }

    public void openNote() { addNoteButton.click(); }

    public void createANote(String testText)
    {

        noteFieldEditMode.sendKeys(testText);
        saveNoteButton.click();
    }

    public void saveNote() {saveNoteButton.click(); }

    public boolean isANoteSaved(String savedText)
    {
        return noteFieldEditMode.getText().toString().equals(savedText);
    }

    public void editANote(String additionalTextToANote)
    {
        editANoteButton.click();
        noteFieldEditMode.sendKeys(additionalTextToANote);

    }

}
