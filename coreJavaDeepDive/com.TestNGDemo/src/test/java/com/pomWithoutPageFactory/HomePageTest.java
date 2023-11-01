package com.pomWithoutPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	LoginPage objLogin;
	HomePage homePage;
	
	@Test(priority =1)
	public void HomeTest() {
		objLogin = new LoginPage(driver);
		
		objLogin.login("Admin", "admin123");
		homePage = new HomePage(driver);
		
		Assert.assertTrue(homePage.getTitle().contains("Dashboard"));
	}
	
}
