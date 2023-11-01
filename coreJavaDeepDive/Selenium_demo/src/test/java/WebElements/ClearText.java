package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearText {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 String url ="https://the-internet.herokuapp.com/iframe";
		 driver.get(url);
		 driver.switchTo().frame(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/iframe")));
//		 WebDriverWait wait1 =new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait1.until(ExpectedConditions.elementToBeSelected(By.xpath("//body[@id='tinymce']/p")));
		WebElement web= driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		web.clear();
		web.sendKeys("Logesh");
		driver.switchTo().parentFrame();
	}

}
