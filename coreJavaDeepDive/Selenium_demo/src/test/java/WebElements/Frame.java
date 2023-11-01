package WebElements;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		String url="https://docs.oracle.com/javase/8/docs/api/";
//		driver.get(url);
//		driver.switchTo().frame("classFrame");
//		driver.findElement(By.xpath("//a[text()='Description']")).click();

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		String url="https://leafground.com/frame.xhtml;jsessionid=node038wykfgt2dxz6uh99nq4t2jv538552.node0";
//		driver.get(url);
//		List<WebElement> element= driver.findElements(By.tagName("iframe"));
//		System.out.println(element.size());
//		driver.switchTo().frame(0);
//		List<WebElement> element1= driver.findElements(By.tagName("button"));
//		System.out.println(driver.findElement(By.tagName("button")).getAttribute("id"));
//		System.out.println(element1.size());
//		driver.findElement(By.cssSelector("[style='color:#ffffff;background: linear-gradient(240deg, #ff7295 0%, #fe875d 100%);border: 0 none;width:15%;height:40%']")).click();;
//		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='default.xhtml']")));
//		driver.findElement(By.xpath("")).click();	
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		String url="https://leafground.com/frame.xhtml;jsessionid=node038wykfgt2dxz6uh99nq4t2jv538552.node0";
//		driver.get(url);
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("[style='background: linear-gradient(240deg, #4b7ecf 0%, #8e70ee 100%); color:#ffffff;border: 0 none;width:15%;height:40%']")).click();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://the-internet.herokuapp.com/nested_frames";
		driver.get(url);
		List<WebElement> e1 = driver.findElements(By.tagName("frame"));
		System.out.println(e1.size());
		driver.switchTo().frame(0);
		List<WebElement> e = driver.findElements(By.tagName("frame"));
		System.out.println(e.size());
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
	}

}
