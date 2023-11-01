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
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TutorialNinja {
		WebDriver driver;
	    
  @Test(priority=0,dataProvider="data",dataProviderClass=ExternalDataProviderXL.class)
  public void registration(String firstName,String lastName,String email,String phoneNo,String password,String confirmPass) {
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//a[@title='My Account']"))).click().build().perform();
	  action.moveToElement(driver.findElement(By.xpath("//a[text()='Register']"))).click().build().perform();
//	  Assert.assertEquals("Register Account", driver.getTitle());
	  driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstName,Keys.TAB,lastName,Keys.TAB,email,Keys.TAB,""+phoneNo+"",Keys.TAB,password,Keys.TAB,confirmPass);
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Assert.assertEquals("Warning: E-Mail Address is already registered!", (driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"))).getText());
//	  driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
	  
  }
  @Test(priority=1,dataProvider="data2",dataProviderClass=ExternalDataProviderXL.class)
  public void logIn(String email,String password) {
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//a[@title='My Account']"))).click().build().perform();
	  action.moveToElement(driver.findElement(By.xpath("(//a[text()='Login'])[1]"))).click().build().perform();
	  Assert.assertEquals("Account Login",driver.getTitle());
	  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email,Keys.TAB,password,Keys.TAB,Keys.TAB,Keys.ENTER);
	  Assert.assertEquals("My Account", driver.getTitle());
  }
  @Test(priority=2) // dependsOnMethods={"logIn","registration"}
  public void wishList() {
	  driver.findElement(By.xpath("//input[@name='search']")).sendKeys("phone",Keys.ENTER);
	  driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
	  driver.findElement(By.xpath("(//i[@class='fa fa-heart'])[1]")).click();
	  Assert.assertEquals("product 11",(driver.findElement(By.xpath("//td[text()='product 11']"))).getText());
	  driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
	  Assert.assertEquals("Your wish list is empty.",(driver.findElement(By.xpath("//p[text()='Your wish list is empty.']"))).getText());

  }
  @BeforeTest()
  public void beforeTest() {
	  EdgeOptions options = new EdgeOptions();
	  driver = new EdgeDriver(options);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  String url ="https://tutorialsninja.com/demo/";
	  driver.get(url);	  
  }

  @AfterTest
  public void afterTest() {
  }

}
