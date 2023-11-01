package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelect {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		String url ="https://bstackdemo.com/";
//		driver.get(url);
//		driver.findElement(By.xpath("//main//select")).click();
//		
//		List<WebElement> li = driver.findElements(By.xpath("//main//select/option"));
//		System.out.println(li.size());
//		String s = "Highest to lowest";
//		for (WebElement webElement : li) {
//			if(webElement.getText().contains(s)) {
//				webElement.click();
//			}
//				
//		}
//		driver.findElement(By.xpath("//option[text()='Highest to lowest']")).click();
		// google with script
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.getElementsByTagName('APjFqb').value='selenium';");
////
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.getElementsByTagName('option')[1].click();");
		//
//		driver.findElement(By.tagName("select")).sendKeys("Lowest to highest");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url ="https://j2store.net/free/index.php/shop/clothing/t-shirts";
		driver.get(url);
		WebElement n=driver.findElement(By.xpath("//span[text()=' Product types']"));

		n.click();

		List<WebElement>l=driver.findElements(By.xpath("//*[@id=\"t3-mainnav\"]/div/div/div[1]/div[2]/div/ul/li[4]/div/div/div/div/div/ul"));

		System.out.println(l.size());

		for(WebElement z:l) {

			System.out.println(z.getText());

		}
		
		
		
	}

	
}
