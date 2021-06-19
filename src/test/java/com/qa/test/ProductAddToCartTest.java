package com.qa.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.common.BaseTest;
import com.qa.pages.CheckOutCompletePage;
import com.qa.pages.CheckOutOverviewPage;
import com.qa.pages.CheckOutPage;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;

public class ProductAddToCartTest extends BaseTest{
	
	LoginPage lp = new LoginPage();
	ProductsPage product = new ProductsPage();
	CheckOutPage checkOut = new CheckOutPage();
	CheckOutOverviewPage overview = new CheckOutOverviewPage();
	CheckOutCompletePage complete = new CheckOutCompletePage();
	
	@Test
	public void addProductCheckout() throws InterruptedException, IOException
	{
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		Thread.sleep(3000);
		
		product.clickOnProduct("Sauce Labs Backpack");
		product.checkoutTheProduct();
		checkOut.fillDetails();
		overview.clickOnFinishButton();
		complete.confirmOderDetails();
	
	}
	
	@Test
	public void deleteProductFromCheckout() throws InterruptedException
	{
		lp.login();
		
		product.clickOnProduct("Sauce Labs Backpack");
		Thread.sleep(3000);
		product.deleteProduct();
		
	}

}
