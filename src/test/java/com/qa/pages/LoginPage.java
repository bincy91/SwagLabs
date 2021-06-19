package com.qa.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.common.BaseTest;
import com.qa.common.CommonUtilities;
import com.qa.common.ScreenBase;

import io.appium.java_client.MobileElement;


public class LoginPage extends ScreenBase{
	
   String USERNAME ="";
   String PASSWORD = "";
   
   public LoginPage() {
	   
	   try {
           Properties properties = CommonUtilities.readProp();
           USERNAME = properties.getProperty("username");
           PASSWORD = properties.getProperty("password");
       } catch (IOException e) {
           e.printStackTrace();
       }
	
}
	

   By username = By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]");
   By password = By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]");
   By buttonLogin = By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView");
   By errorMessage = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView");
		
	public void enterUsername()
	{
		driver.findElement(username).sendKeys(USERNAME);
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys(PASSWORD);
	}
	
	public void clickLogin()
	{
		driver.findElement(buttonLogin).click();
	}
	
	public void verifyErrorMessage()
	{
		String actual = "Username and password do not match any user in this service.";
		String expected = driver.findElement(errorMessage).getAttribute("text");
		Assert.assertEquals(actual, expected);
	}
	
	
	public void login()
	{
		enterUsername();
		enterPassword();
        clickLogin();
    }
	
	public void invalidUsernameLogin()
	{
		driver.findElement(username).sendKeys("standard_user");
		driver.findElement(password).sendKeys("abcd");
		clickLogin();
	}
	

}
