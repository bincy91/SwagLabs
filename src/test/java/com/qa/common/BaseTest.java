package com.qa.common;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.reports.ExtentReportsClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest  extends ExtentReportsClass{
	
	public static AppiumDriver driver;
	
	@BeforeSuite
    public void setUp() throws MalformedURLException {
		
		pageObjectConfig();
		 
		CommonUtilities utils = new CommonUtilities();
		utils.initDriver();
		driver = utils.driver;
	}
	
	private void pageObjectConfig() {

    }
	
	@AfterSuite
	public void tearDown() {

		driver.quit();

	}
		 
}
