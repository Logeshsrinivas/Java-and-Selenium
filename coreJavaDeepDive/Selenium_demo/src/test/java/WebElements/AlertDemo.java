package WebElements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		String url ="https://leafground.com/alert.xhtml";
//		driver.get(url);
//		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
//		Alert alert =driver.switchTo().alert();
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(5000);
//		alert.accept();
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		String url ="https://leafground.com/alert.xhtml";
//		driver.get(url);
//		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
//		Alert alert =driver.switchTo().alert();
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(5000);
//		alert.accept();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url ="https://leafground.com/alert.xhtml";
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Show'])[3]")));
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Alert alert =driver.switchTo().alert();
//		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		alert.accept();
	}

}
