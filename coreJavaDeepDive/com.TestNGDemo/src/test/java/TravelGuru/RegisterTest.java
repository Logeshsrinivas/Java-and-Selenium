package TravelGuru;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
	RegisterPage registerPage;
	
	
	@Test
	public void TestSignup() throws InterruptedException {
		
		registerPage =new RegisterPage(driver);
//		registerPage.clickSignup();
		registerPage.registerAccount("Logesh", "Srinivasan", "9952008803", "logeshsrinivas@gmail.com", "Logesh@11", "Logesh@11");
		registerPage.registerClick();
//		Assert.assertTrue(registerPage.getVerifyText().contains("on signing up with "));
		Assert.assertTrue(registerPage.errormessage.getText().contains("Registration failed! please check the form details."));
	}

}
