package com.qa.test;


import org.testng.annotations.Test;

import com.qa.common.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;

public class LoginTest extends BaseTest{
	
	LoginPage lp = new LoginPage();
	ProductsPage product = new ProductsPage();
	
	@Test()
	public void verifyValidLogin() throws Exception {
		
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		
		product.verifySuccessfulLogin();
		
	}
	
	@Test()
	public void invalidLogin() throws Exception {
		
		lp.invalidUsernameLogin();
		lp.verifyErrorMessage();
		
	   }
	
	
	
	
	
	

}
