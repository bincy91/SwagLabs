package com.qa.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import com.qa.common.BaseTest;
import com.qa.common.CommonUtilities;

public class CheckOutPage extends BaseTest{
	
	String FIRSTNAME = "";
	String LASTNAME = "";
	String ZIPCODE = "";
	
	By header = By.xpath("//*[(@text,'CHECKOUT: INFORMATION')]");
	
	By firstName = By.xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]");
	
	By lastName = By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]");
	
	By zipCode = By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]");
	
	By buttonContinue = By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]/android.widget.TextView");
	
	By buttonFinish = By.xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]/android.widget.TextView");
	
	public void fillDetails() throws IOException
	{
		Properties properties = CommonUtilities.readProp();
		FIRSTNAME = properties.getProperty("firstName");
		LASTNAME = properties.getProperty("lastName");
		ZIPCODE = properties.getProperty("zipCode");
		
		driver.findElement(firstName).sendKeys(FIRSTNAME);
		driver.findElement(lastName).sendKeys(LASTNAME);
		driver.findElement(zipCode).sendKeys(ZIPCODE);
		driver.findElement(buttonContinue).click();
	}

	
}
