package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://www.zoho.com/signup.html";
		driver.get(url);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('email').value='Logesh'");
		jse.executeScript("document.getElementById('password').value='Logesh@11'");
		jse.executeScript("document.getElementById('rmobile').value='9952008803'");
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#signupbtn")));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tos")));
		jse.executeScript("document.getElementById('tos').click();");
		
//		jse.executeScript("document.getElementById('signupbtn').click();");
//		driver.findElement(By.className("za-tos"));

		
	}

}
