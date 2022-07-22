import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTest extends DriverFactory {

    LoginPage loginPage;



    @Test
    public void testLocationAndCategories()  {
        loginPage= new LoginPage(driver);
        loginPage.locationSave();
        loginPage.categoriesSelection();
    }


}
