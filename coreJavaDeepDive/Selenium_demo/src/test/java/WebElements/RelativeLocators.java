package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/signup.html");
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("Logesh");
		WebElement password = driver.findElement(with(By.cssSelector("input")).below(email));
		password.sendKeys("Logesh@11");
		WebElement phoneNo = driver.findElement(with(By.tagName("input")).below(password));
		phoneNo.sendKeys("9952008803");
		WebElement agree = driver.findElement(with(By.cssSelector("#signup-termservice")).below(phoneNo));
		agree.click();
//		WebElement sign = driver.findElement(with(By.tagName("input")).below(agree));
//		sign.click();
		WebElement linkedin = driver.findElement(By.className("vi-linkedin"));
//		linkedin.click();
		WebElement google = driver.findElement(with(By.tagName("span")).toLeftOf(linkedin));
//		google.click();
		WebElement ms = driver.findElement(with(By.tagName("span")).toRightOf(linkedin));
//		ms.click();
		WebElement near = driver.findElement(with(By.tagName("span")).near(linkedin));
//		near.click();

		
		
	}

}
