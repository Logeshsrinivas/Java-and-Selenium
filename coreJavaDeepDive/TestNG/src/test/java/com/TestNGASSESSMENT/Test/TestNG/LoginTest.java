package com.TestNGASSESSMENT.Test.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	LoginPage loginPage;
	
	@Test(priority = 1, dataProvider = "data1", dataProviderClass = DataGiver.class)
	public void loginTest(String email, String password) {
		
		loginPage= new LoginPage(driver);
		
		loginPage.LoginAccount(email, password);
		
		loginPage.clickLoginbutton();
		
		Assert.assertTrue(loginPage.getVerifyText().contains("logeshsrinivas@gmail.com"));
		
		
	}

}
