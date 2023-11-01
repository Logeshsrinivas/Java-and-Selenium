package WebElements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String url = "https://www.naukri.com/";
		driver.get(url);
		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).sendKeys("Software Engineer");
		driver.findElement(By.xpath("//input[@id='expereinceDD']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys("Chennai",Keys.ENTER);
//		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='chk-Hybrid-wfhType-']")));
		driver.findElement(By.xpath("(//i[@class='ni-icon-unchecked'])[2]")).click();
		WebDriverWait wait1 =new WebDriverWait(driver,Duration.ofSeconds(5));
//		driver.switchTo().frame(0);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='ni-icon-unchecked'])[4]")));
//		Thread.sleep(4000);
		driver.findElement(By.xpath("(//i[@class='ni-icon-unchecked'])[4]")).click();
		driver.findElement(By.xpath("//a[@title='Software Engineer - Trainee - Work from Home']")).click();
		String s1 =driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		for (String string : s) {
			driver.switchTo().window(string);
//			if(driver.getCurrentUrl().equals("https://www.naukri.com/job-listings-software-engineer-trainee-work-from-home-it-company-madurai-tamil-nadu-chennai-tamil-nadu-tiruchirapalli-trichy-tamil-nadu-0-to-5-years-230923004892?src=jobsearchDesk&sid=16974478422697454&xp=1&px=1"));
			System.out.println(driver.getTitle());
		
		}
		driver.switchTo().window(s1);
	}
	

}
