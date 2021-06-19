package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.common.BaseTest;

import io.appium.java_client.MobileElement;

public class CheckOutOverviewPage extends BaseTest{
	
	By header = By.xpath("//*[(@text='CHECKOUT: OVERVIEW')]");
	
	By description = By.xpath("//*[(@text='Sauce Labs Backpack')]");
	By buttonFinish = By.xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]/android.widget.TextView");
	
	public void clickOnFinishButton()
	{
		String actual = "CHECKOUT: OVERVIEW";
		String expected = driver.findElement(header).getAttribute("text");
		Assert.assertEquals(actual, expected);
		
		driver.findElement(buttonFinish).click();
	}

}
