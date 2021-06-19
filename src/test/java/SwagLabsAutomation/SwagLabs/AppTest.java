package SwagLabsAutomation.SwagLabs;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
    @Test
    public void shouldAnswerWithTrue() throws MalformedURLException
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11.0");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "com.swaglabsmobileapp");
        cap.setCapability("appActivity", ".MainActivity");
        
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AppiumDriver driver = new AndroidDriver(url,cap);
        String sessionId = driver.getSessionId().toString();
        
        
    }
}
