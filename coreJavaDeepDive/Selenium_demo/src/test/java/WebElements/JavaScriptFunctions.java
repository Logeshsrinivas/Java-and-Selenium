package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptFunctions {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String url = "https://demo.smart-hospital.in/admin/notification/add";
	driver.get(url);
//	xpathClick(driver,"(//input[@class='RNmpXc'])[2]");
//	
//}
//public static void xpathClick(WebDriver driver,String string) {
//	click(driver,driver.findElement(By.xpath(""+string+"")));
//	
//}
//public static void click(WebDriver driver,WebElement Element) {
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].click()", Element);
	
//	xpathClick(driver,"(//input[@class='RNmpXc'])[2]");
	xpathClick(driver, "(//a[@class='btn btn-primary width50'])[3]");
	xpathClick(driver, "//button[text()='Sign In']");
	xpathClick(driver, "//span[text()='Messaging']");
	xpathClick(driver, "//a[@href='https://demo.smart-hospital.in/admin/notification/add']");
	xpathValue(driver, "//input[@id='date']", "11/11/2000");
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
