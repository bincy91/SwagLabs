package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.qa.common.ScreenBase;

import io.appium.java_client.MobileElement;

public class ProductsPage extends ScreenBase{
	

	By header = By.xpath("//*[(@text='PRODUCTS')]");
	
	By buttonAddtoCart = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]");
	
	By productList = By.xpath("(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]");
	
	By buttonAddToCart = By.xpath("//*[contains(@text,'ADD TO CART')]");
	
	By buttonCart = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");
	
	By buttonCheckOut = By.xpath("//*[(@text='CHECKOUT')]");
	
	By buttonRemove = By.xpath("//*[(@text='REMOVE')]");
	
	By buttonContinueShopping = By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE SHOPPING\"]");
	
	
	public void clickOnProduct(String productName) throws InterruptedException
	{
		/*
		 * List<MobileElement> list = driver.findElements(listOf);
		 * 
		 * for(int i =0; i<list.size();i++) {
		 * if(list.get(i).getAttribute("text").equals("Sauce Labs Backpack")) {
		 * list.get(i).click(); } }
		 */
		
	   driver.findElement(productList).click();	
	   driver.findElement(buttonAddToCart).click();
	   driver.findElement(buttonCart).click();
	}
	
	public void verifySuccessfulLogin()
	{
	  String actual = "PRODUCTS";
	  String expected = driver.findElement(header).getAttribute("text");
	  Assert.assertEquals(actual, expected);
	}
	
	
	public void checkoutTheProduct()
	{
		driver.findElement(buttonCheckOut).click();
	}
	
	public void deleteProduct()
	{
		driver.findElement(buttonRemove).click();
		driver.findElement(buttonCart).isDisplayed();
	}

}
