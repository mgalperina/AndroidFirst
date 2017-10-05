package nz.co.trademe.property.uat.Tests.TestsForWL;

import io.appium.java_client.AppiumDriver;
import nz.co.trademe.property.uat.Screens.LoginScreen;
import nz.co.trademe.property.uat.Screens.SaleResultsScreen;
import nz.co.trademe.property.uat.Screens.SearchForSaleScreen;
import nz.co.trademe.property.uat.Utilities.AppiumDriverBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class AddToWLThenRemoveViaOverflow {

    AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        AppiumDriverBuilder driverBuilder = new AppiumDriverBuilder();
        driver = driverBuilder.CreateDriver();

    }

    @Test
    public void addToWLThenRemoveViaOverflow() {

        SearchForSaleScreen defaultSearch = new SearchForSaleScreen(driver);
        defaultSearch.clickButtonSearch();

        SaleResultsScreen saleResults = new SaleResultsScreen(driver);
        saleResults.openOverflowMenu();
        saleResults.addToWL();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.logIn("mariia.galperina@trademe.co.nz", "BumbleBee");

        Assert.assertTrue(saleResults.isWLIconDisplayed());

        saleResults.removeFromWLViaOverflow();

        //Assert.assertFalse(saleResults.isWLIconRemoved(By.id("nz.co.trademe.property.uat:id/triangleImageView")));

        Assert.assertFalse(saleResults.isWLIconDisplayed());
        //It throws an error: 
        // org.openqa.selenium.NoSuchElementException: Can't locate an element by this strategy: Locator map:
//        - native content: "By.chained({By.id: nz.co.trademe.property.uat:id/triangleImageView})"
//                - html content: "by id or name "wlIconOnCard""
//
//        at io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:118)
//        at io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:61)
//        at io.appium.java_client.android.AndroidElement$$EnhancerByCGLIB$$c0b591f0.isDisplayed(<generated>)
//        at nz.co.trademe.property.uat.Screens.SaleResultsScreen.isWLIconDisplayed(SaleResultsScreen.java:81)
//        at nz.co.trademe.property.uat.Tests.TestsForWL.AddToWLThenRemoveViaOverflow.addToWLThenRemoveViaOverflow(AddToWLThenRemoveViaOverflow.java:46)
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:498)
//        at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
//        at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
//        at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
//        at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
//        at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
//        at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
//        at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
//        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
//        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
//        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
//        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
//        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
//        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
//        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
//        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
//        at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
//        at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
//        at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
//        at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
//        at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
//        Caused by: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction@7c098bb3 (tried for 1 second(s) with 500 MILLISECONDS interval)
//        at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:264)
//        at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)
//        at io.appium.java_client.pagefactory.AppiumElementLocator.waitFor(AppiumElementLocator.java:90)
//        at io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:111)
//	... 28 more
//        Caused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.chained({By.id: nz.co.trademe.property.uat:id/triangleImageView})
//        For documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html
//        Build info: version: '3.5.3', revision: 'a88d25fe6b', time: '2017-08-29T12:54:15.039Z'
//        System info: host: 'TMMAC002203', ip: 'fe80:0:0:0:140b:aceb:6536:6b1d%en0', os.name: 'Mac OS X', os.arch: 'x86_64', os.version: '10.12.1', java.version: '1.8.0_101'
//        Driver info: driver.version: AndroidDriver
//        at io.appium.java_client.pagefactory.bys.builder.ByChained.findElement(ByChained.java:72)
//        at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)
//        at io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)
//        at io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)
//        at io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)
//        at io.appium.java_client.pagefactory.bys.ContentMappedBy.findElement(ContentMappedBy.java:36)
//        at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)
//        at io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)
//        at io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)
//        at io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)
//        at io.appium.java_client.pagefactory.AppiumElementLocator.lambda$0(AppiumElementLocator.java:112)
//        at io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction.apply(AppiumElementLocator.java:166)
//        at io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction.apply(AppiumElementLocator.java:1)
//        at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)
//	... 30 more


    }

    @After
    public void quit() {

        driver.quit();
    }
}
