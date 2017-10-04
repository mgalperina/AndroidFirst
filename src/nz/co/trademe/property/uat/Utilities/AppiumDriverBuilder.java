package nz.co.trademe.property.uat.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;


    public  class AppiumDriverBuilder {
        public AppiumDriver CreateDriver() throws MalformedURLException {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("noReset", false);
            cap.setCapability("clearSystemFiles", true);
            cap.setCapability("override-session", true);
            cap.setCapability("appActivity", "nz.co.trademe.property.activity.MainActivity");
            cap.setCapability("platformName", "Android");
            //cap.setCapability("platformVersion", "7.0");
            //cap.setCapability("deviceName", "Galaxy S8");
            cap.setCapability("deviceName", "Android Accelerated x86");
            cap.setCapability("platformVersion", "6.0");
            //cap.setCapability("deviceName", "Galaxy S6");
            //cap.setCapability("platformVersion", "6.0.1");
            cap.setCapability("appPackage", "nz.co.trademe.property.uat");
            cap.setCapability("browserName", "");
            cap.setCapability("app", "/Users/mgalperina/Desktop/TestAutomation/APK/androidproperty-uat-2.0-uat.apk");
            return new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        }


    }
