import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumExecutionMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginPage  extends DriverFactory {


    public LoginPage(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(driver,this);
    }


    private final By location = By.id("com.pozitron.hepsiburada:id/locationView");
    private final By citySelector = By.xpath("//android.widget.ImageView[@content-desc='İl seçin']");
    private final By cityName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    private final By townSelector = By.xpath("//android.widget.ImageView[@content-desc='İlçe seçin']");
    private final By townName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    private final By districtSelector = By.xpath("//android.widget.ImageView[@content-desc='Mahalle seçin']");
    private final By districtName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView");
    private final By locationSaveButton = By.id("com.pozitron.hepsiburada:id/button");
    private final By categoriesSelect = By.id("com.pozitron.hepsiburada:id/nav_graph_category");
    private final By phoneCategory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[3]/android.view.ViewGroup/android.widget.TextView");
    private final By iOSPhoneCategory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");



    public void locationSave()  {
        //Thread.sleep(15000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(location)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(citySelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityName)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(townSelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(townName)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtSelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtName)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locationSaveButton)).click();
    }

    public void categoriesSelection() {
        //Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(categoriesSelect)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneCategory)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(iOSPhoneCategory)).click();
    }
//
//    public void login()  {
//        locationSave();
//        categoriesSelection();
//    }

}
