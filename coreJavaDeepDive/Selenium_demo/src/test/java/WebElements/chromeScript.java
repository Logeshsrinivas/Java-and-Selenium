package WebElements;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://www.google.com/";
		driver.get(url);
		JavascriptExecutor jae = (JavascriptExecutor)driver;
		jae.executeScript("document.getElementById('APjFqb').value='Selenium'");
		jae.executeScript("history.go(0)");
		jae.executeScript("window.location='https://www.lambdatest.com'");
		Thread.sleep(2000);
		jae.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		jae.executeScript("window.scrollBy(-500,0)");
		jae.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		jae.executeScript("");
	}

}
