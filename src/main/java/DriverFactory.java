import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    public static WebDriverWait wait;
    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities desiredCapabilities;


    @BeforeTest
    public void setUp() throws MalformedURLException {
        desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("appium:automationName", "UIAutomator2");
        desiredCapabilities.setCapability("appium:deviceName", "sdk gphone64_x86_64");
        desiredCapabilities.setCapability("appium:app","C:\\Users\\baris\\Downloads\\Hepsiburada_ Online Alışveriş_5.4.0_apkcombo.com.apk");
        desiredCapabilities.setCapability("appium:language", "tr");
        desiredCapabilities.setCapability("appium:locale","tr");
        desiredCapabilities.setCapability("appium:noReset", false);
        desiredCapabilities.setCapability("appium:fullReset", true);
        desiredCapabilities.setCapability("appium:autoGrantPermissions", true);

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        wait = new WebDriverWait(driver,15);
    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }



}
