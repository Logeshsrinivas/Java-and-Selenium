package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		if(driver.getTitle().equalsIgnoreCase("Google"))
			System.out.println("Verified");
		else System.out.println("Not verified");
		
		WebElement google = driver.findElement(By.name("q"));
		boolean is = google.isEnabled();
		System.out.println(is);
		google.sendKeys("Selenium");
		
		WebElement googleSearch = driver.findElement(By.xpath(("(//input[@class='gNO89b'])[1]")));
		boolean iss = googleSearch.isEnabled();
		System.out.println(iss);
		Thread.sleep(1000);
		googleSearch.click();
		
		WebElement selenium = driver.findElement(By.xpath(("(//span[@class='VuuXrf'])[1]")));
//		Thread.sleep(1000);
		selenium.click();

	}

}
