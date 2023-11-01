package WebElements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewWindow {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();	
//		driver.manage().window().maximize();
//		String url = "https://leafground.com/window.xhtml";
//		driver.get(url);
//		driver.findElement(By.xpath("//button[@id='j_idt88:new']")).click();
//		String s = driver.getWindowHandle();
//		Set<String> AllWindow = driver.getWindowHandles();
//		for (String string : AllWindow) {
//			driver.switchTo().window(string);		
//		}
//		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Logesh");
//		System.out.println(driver.getTitle());
//		driver.close();
		
		
		
//		WebDriver driver = new ChromeDriver();	
//		driver.manage().window().maximize();
//		String url = "https://leafground.com/window.xhtml";
//		driver.get(url);
//		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
//		String s = driver.getWindowHandle();
//		Set<String> s1 =driver.getWindowHandles();
//		for (String string : s1) {
//			driver.switchTo().window(string);
//			if(driver.getTitle().equalsIgnoreCase("Dashboard"));
//			else driver.close();
//		}
//		System.out.println(s1.size());
//		driver.findElement(By.xpath(""));
		
		
//		WebDriver driver = new ChromeDriver();	
//		driver.manage().window().maximize();
//		String url = "https://leafground.com/window.xhtml";
//		driver.get(url);
//		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
//		String s = driver.getWindowHandle();
//		Set<String> s1 =driver.getWindowHandles();
//		for (String string : s1) {
//			driver.switchTo().window(string);
//			if(driver.getTitle().equalsIgnoreCase("Window"));
//			else driver.close();
//		}
//		

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		String url = "https://leafground.com/window.xhtml";
		driver.get(url);
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt88:j_idt95']")));
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
		String s = driver.getWindowHandle();
		Set<String> s1 =driver.getWindowHandles();
		for (String string : s1) {
			driver.switchTo().window(string);
			if(driver.getTitle().equalsIgnoreCase("Window"));
			else driver.close();
		}


	}
}


