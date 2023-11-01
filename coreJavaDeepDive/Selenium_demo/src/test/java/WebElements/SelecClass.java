package WebElements;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelecClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url ="https://cruise.thomascook.in/";
		driver.get(url);
		Select select = new Select(driver.findElement(By.xpath("//select[@name='city']")));
		select.selectByVisibleText("Canada");
		List<WebElement> li = select.getOptions();
		System.out.println(li.size());
		for (WebElement webElement : li) {
			System.out.println("Options :" + webElement.getText());
		}
		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='sailDate']")));
		select1.selectByVisibleText("May-2024");
		List<WebElement> li1 = select1.getOptions();
		System.out.println(li1.size());
		for (WebElement webElement : li1) {
			System.out.println("Options :" + webElement.getText());
		}
		Select select2 = new Select(driver.findElement(By.xpath("//select[@name='duration']")));
		select2.selectByVisibleText("1 To 3 night(s)");
		List<WebElement> li2 = select2.getOptions();
		System.out.println(li2.size());
		for (WebElement webElement : li2) {
			System.out.println("Options :" + webElement.getText());
		}
		Select select3 = new Select(driver.findElement(By.xpath("//select[@name='cruise']")));
		select3.selectByIndex(1);
		List<WebElement> li3 = select3.getOptions();
		System.out.println(li3.size());
		for (WebElement webElement : li3) {
			System.out.println("Options :" + webElement.getText());
		}
		driver.findElement(By.cssSelector("[style='padding: 0.8rem .96rem;']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='modify search']")));
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[text()='modify search']")).click();
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='modifysearch']")));
		action.moveToElement(driver.findElement(By.xpath("//a[@id='modifysearch']"))).click().build().perform();
//		Thread.sleep(5000);
//		WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='city']")));
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='city']")));
		Select select4 = new Select(driver.findElement(By.xpath("//select[@name='city']")));
		select4.selectByVisibleText("Australia");
		Select select5 = new Select(driver.findElement(By.xpath("//select[@name='sailDate']")));
		select5.selectByVisibleText("May-2024");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		driver.findElement(By.xpath("(//a[text()='Book now'])[1]")).click();
	}

}
