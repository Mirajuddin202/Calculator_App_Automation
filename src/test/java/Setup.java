import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class Setup {
    AndroidDriver driver;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
//        DesiredCapabilities caps=new DesiredCapabilities();
//        caps.setCapability("platformName","Android");
//        caps.setCapability("platformVersion","14");
//        caps.setCapability("appPackage","com.google.android.calculator");
//        caps.setCapability("appActivity","com.android.calculator2.Calculator");
//        caps.setCapability("automationName","UiAutomator2");
//        caps.setCapability("app","D:\\Apk\\calculator.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "14"); // Replace with actual version
        capabilities.setCapability("deviceName", "DESKTOP-OEED3M3");         // Use `adb devices` to get device name
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("app", "D:\\Apk\\calculator.apk");



        URL url=new URL(("http://127.0.0.1:4723"));

        driver=new AndroidDriver(url,capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;

    }
   // @AfterTest
    public void quitApp(){
        driver.quit();

    }
}
