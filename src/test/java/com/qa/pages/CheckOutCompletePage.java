package com.qa.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.qa.common.BaseTest;

import io.appium.java_client.MobileElement;

public class CheckOutCompletePage extends BaseTest{
	
	By header = By.xpath("//*[(@text='CHECKOUT: COMPLETE!')]");
	
	By textThankYou = By.xpath("//*[(@text='THANK YOU FOR YOU ORDER')]");
	
	By textYourOrderHasBeenDispatched = By.xpath("//*[(@text='Your order has been dispatched, and will arrive just as fast as the pony can get there!')]");


	public void confirmOderDetails()
	{
		driver.findElement(header).isDisplayed();
		
		MobileElement ele = (MobileElement) driver.findElement(textThankYou);
		String expectedText = "THANK YOU FOR YOU ORDER";
		Assert.assertEquals(expectedText, ele.getText());
	}


}
