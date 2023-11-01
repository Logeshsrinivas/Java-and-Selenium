package com.pomWithoutPageFactory;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	WebDriver driver;
	LoginPage objLogin;
	
	@Test(priority=0)
	public void loginTest() {
		objLogin = new LoginPage(driver);
		
//		objLogin.login("Admin", "admin123");
		
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.contains("Login"));
	}

}
