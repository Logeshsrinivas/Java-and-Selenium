package TestNG.com.TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	WebDriver driver;
	
	@DataProvider(name="testData")
	public Object[][] dataProvFunc(){
		return new Object[][] {{"java"},{"Testing"}};
	}
	
@BeforeMethod
public void setUp() {
	System.out.println("Start the Test");
	driver = new EdgeDriver();
	driver.get("https://www.bing.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test(dataProvider="testData")
public void search(String Keyword) {
	driver.findElement(By.id("sb_form_q")).sendKeys(Keyword,Keys.ENTER);
	System.out.println("Search result is displayed");
}
}
