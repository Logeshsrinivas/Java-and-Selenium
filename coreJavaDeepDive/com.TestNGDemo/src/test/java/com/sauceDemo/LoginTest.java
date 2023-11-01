package com.sauceDemo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	LoginPage loginPage;
	
	@Test(priority=0,dataProvider="data",dataProviderClass =DataGiver.class)
	public void loginTest(String user, String Password) {
		loginPage = new LoginPage(driver);
		
		loginPage.loginAccount(user,Password);
		
		Assert.assertTrue(loginPage.getverifyText().contains("Products"));
		
	}
}
