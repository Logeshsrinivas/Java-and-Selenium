package com.pomWithPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	LoginPage objLogin;
	
	@Test(priority=0)
	public void loginTest() {
		objLogin = new LoginPage(driver);
		
//		objLogin.login("Admin", "admin123");
		
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.contains("Login"));
	}

}
