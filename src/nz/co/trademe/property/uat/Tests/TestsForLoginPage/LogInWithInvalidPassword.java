package nz.co.trademe.property.uat.Tests.TestsForLoginPage;
import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.LoginScreen;
import nz.co.trademe.property.uat.Screens.NavigationDrawer;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogInWithInvalidPassword {


    AppiumDriver driver;
    String destDir;
    DateFormat dateFormat;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void logInWithInvalidPassword() {

        SearchForSaleScreen defaultScreen = new SearchForSaleScreen(driver);
        defaultScreen.openNavigationDrawer();

        NavigationDrawer navDrawer = new NavigationDrawer(driver);
        navDrawer.openMyAccountToLogIn();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.mnz", "BumbleBee");
//        takeScreenShot();
//    }
//
//    public void takeScreenShot()
//    {
//        destDir = "screenshots";
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
//        new File(destDir).mkdirs();
//        String destFile = dateFormat.format(new Date()) + " .png";
//
//        try {
//            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
//        }catch (IOException e) {
//            e.printStackTrace();
//
//        }





        //Temporary assertion - to assert that I'm still on Login page
        Assert.assertTrue(loginScreen.isNotLoggedIn());

    }

    @After
    public void quit() {

        driver.quit();
    }
}
