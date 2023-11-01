package WebElements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestByID {

	public static void main(String[] args) {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		List<WebElement> Element1 = driver.findElements(By.tagName("a"));
		System.out.println(Element1.size());
		for (WebElement webElement : Element1) {
			System.out.println(webElement.getText());
			
		}
//		Element1.get
//		System.out.println(Element1.getText());
//		Element1.sendKeys("Selenium");
//		Element1.click();
//		Element1.sendKeys("Logesh");
//		
//		WebElement Element2= driver.findElement(By.id("j_idt88:j_idt91"));
//		Element2.clear();
//		Element2.sendKeys("Guduvancheri");
		
		
	}

}
