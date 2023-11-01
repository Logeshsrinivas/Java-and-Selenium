package TestNG.com.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;

public class DemoTest {
	public WebDriver driver;
	
  @Test
  public void validation() {
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("hard driver",Keys.ENTER);
  }
  @BeforeTest
  public void beforeTest() {
	 ChromeOptions options = new ChromeOptions();
	 driver = new ChromeDriver(options);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 String url ="https://www.amazon.in/";
	 driver.get(url);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
