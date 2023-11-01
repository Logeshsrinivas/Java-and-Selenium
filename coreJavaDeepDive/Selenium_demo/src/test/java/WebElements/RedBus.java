package WebElements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class RedBus {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://www.redbus.in/";
		driver.get(url);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		xpathValue(driver, "//input[@id='src']", "Chennai");
		xpathValue(driver, "//input[@id='dest']", "Kanyakumari");
		xpathClick(driver, "//div[@id='onwardCal']");
		scrollDown(driver);
//		Thread.sleep(5000);
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.getElementsByClassName('dayText').value='27 Oct 2023';");
		
		 List<WebElement> li = driver.findElements(By.xpath("//div[@class='labelCalendarContainer']/div"));
		 System.out.println(li.size());
		 for (WebElement webElement : li) {
			 System.out.println(webElement.getTagName());
			 System.out.println(webElement.getText());
//			if(webElement.getText().equalsIgnoreCase("23"))
//				webElement.click();
		}
		
		
//		xpathActionClick(driver, "//div/text[text()='21 Oct']");
//		xpathActionClick()
//		xpathClick(driver, "//button[@id='search_button']");
//		screenShot(driver);
		
		
		
		
			
	}
	public static void scrollDown(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		
	}
	public static void xpathActionClick(WebDriver driver,String path) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(""+path+""))).click().build().perform();;
		
	}
	public static void xpathClick(WebDriver driver,String string) {
		click(driver,driver.findElement(By.xpath(""+string+"")));
		
	}
	public static void click(WebDriver driver,WebElement Element) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", Element);	
		
	}
	public static void xpathValue(WebDriver driver,String string,String value) {
		value(driver,driver.findElement(By.xpath(""+string+"")),value);
		
	}
	public static void value(WebDriver driver,WebElement Element,String value) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+value+"'", Element);	

}
}
