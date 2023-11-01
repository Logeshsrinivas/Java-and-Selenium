package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ListTest {

	public static void main(String[] args) {
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		String url ="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
//		driver.get(url);
//		Actions action = new Actions(driver);
////		action.moveToElement(driver.findElement(By.xpath("//select[@id='first']"))).click().build().perform();
//		Select select = new Select(driver.findElement(By.xpath("//select[@id='first']")));
////		select.selectByVisibleText("Google");
////		select.selectByVisibleText("Iphone");
//		select.selectByVisibleText("Yahoo");
//		select.deselectByVisibleText("Yahoo");
//		System.out.println(select.getOptions());
//		
//		List<WebElement> li = select.getOptions();
//		System.out.println(li.size());
//		for (WebElement webElement : li) {
//			System.out.println("options : "+webElement.getText());
//			
//		}
//		
//		System.out.println("Multiple dropdown is present or not :" +select.isMultiple());
//		
// Multi Select
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String url ="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		driver.get(url);
		Select select = new Select(driver.findElement(By.xpath("//select[@id='second']")));
		System.out.println("Multiple dropdown is present or not :" +select.isMultiple());
		select.selectByVisibleText("Pizza");
		select.selectByVisibleText("Burger");
//		select.deselectByIndex(0);
		select.deselectAll();



	}

}
