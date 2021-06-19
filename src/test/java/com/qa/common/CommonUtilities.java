package com.qa.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CommonUtilities {
	
	DesiredCapabilities caps = new DesiredCapabilities();

    public AppiumDriver<MobileElement> driver;
    
    public void initDriver() throws MalformedURLException
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11.0");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "com.swaglabsmobileapp");
        cap.setCapability("appActivity", ".MainActivity");
        
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
    }
    
    public static Properties readProp() throws IOException 
    {
    	File file = new File("C:\\Users\\bincy.babu\\eclipse-workspace\\SwagLabsAutomation\\resources\\config.properties");
    	Properties prop = new Properties();
    	
    	InputStreamReader is = new InputStreamReader(new FileInputStream(file));
        prop.load(is);
        return prop;
    	
    }
    
    public static void main(String args[]) throws IOException {
    	CommonUtilities.readProp();
    }


}
