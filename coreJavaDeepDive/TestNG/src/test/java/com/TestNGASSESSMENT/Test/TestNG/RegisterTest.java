package com.TestNGASSESSMENT.Test.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
	
	RegisterPage registerPage;
	
	
	@Test(priority = 0,dataProvider = "data", dataProviderClass = DataGiver.class)
	public void register(String gender, String firstNAme, String lastNAme, String Email, String Password, String cPassword) {
		
		registerPage= new RegisterPage(driver);
		
		registerPage.RegisterAccount(gender, firstNAme, lastNAme, Email, Password, cPassword);
		registerPage.clickRegisterSubmit();
		
		Assert.assertTrue(registerPage.getVerifyText().contains("The specified email already exists"));
		
		
		
	}

}
