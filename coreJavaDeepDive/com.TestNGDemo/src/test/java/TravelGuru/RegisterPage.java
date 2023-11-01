package TravelGuru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[text()=' My Account ']")
	WebElement accountClick;
	@FindBy(xpath="//a[text()=' SIGNUP ']")
	WebElement signUp;
	@FindBy(name="firstName")
	WebElement firstName;
	@FindBy(name="lastName")
	WebElement lastName;
	@FindBy(id="mobile")
	WebElement phoneNo;
	@FindBy(name ="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="cpassword")
	WebElement cPassword;
	@FindBy(id="btn_register")
	WebElement registerBT;
	@FindBy(xpath="//span[text()='on signing up with ']")
	WebElement verifyText;
	@FindBy(xpath="//div[text()='Registration failed! please check the form details.']")
	WebElement errormessage;


	public RegisterPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
}
	public void clickSignup() {
			Actions action = new Actions(driver);
			action.moveToElement(accountClick).perform();
			signUp.click();
	}
	
	public void setFirstName(String firstname) {
			firstName.sendKeys(firstname);
	}
	public void setLastName(String lastname) {
			lastName.sendKeys(lastname);
	}
	public void setMobile(String mobile) throws InterruptedException {
			
			phoneNo.sendKeys(mobile);
	}
	public void setEmail(String mail) {
		email.sendKeys(mail);
}
	public void setPassWord(String pass) {
		password.sendKeys(pass);
}
	public void setCpassWord(String cPass) {
		cPassword.sendKeys(cPass);
}
	public void registerClick() {
		registerBT.click();
	}
	public String getVerifyText() {
		return verifyText.getText();
	}
	public void registerAccount(String firstname, String lastname, String mobile, String mail,String password, String cpassword) throws InterruptedException {
					clickSignup();
					setFirstName(firstname);
					setLastName(lastname);
					setMobile(mobile);
					setEmail(mail);
					setPassWord(password);
//					Thread.sleep(5000);
					setCpassWord(cpassword);
//		
	}
	
			
}
