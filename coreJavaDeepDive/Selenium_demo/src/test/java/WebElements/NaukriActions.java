package WebElements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String url = "https://www.naukri.com/";
		driver.get(url);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Jobs']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//div[text()='IT jobs']"))).click().build().perform();
		act.moveToElement(driver.findElement(By.xpath("(//i[@class='ni-icon-checked'])[3]"))).click().build().perform();
		WebDriverWait wait1 =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='ni-icon-unchecked'])[4]")));
		act.moveToElement(driver.findElement(By.xpath("(//i[@class='ni-icon-unchecked'])[4]"))).click().build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Pro*C-(Pro*C/C,Sql,Unix)-4-9yrs-Pan India-Immd-2M']"))).click().build().perform();
		String s1 =driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		for (String string : s) {
			driver.switchTo().window(string);
			System.out.println(driver.getTitle());
			
		}
		driver.switchTo().window(s1);

		
		


	}

}
