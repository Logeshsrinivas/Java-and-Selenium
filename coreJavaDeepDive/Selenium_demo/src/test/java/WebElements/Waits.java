package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/waits.xhtml;jsessionid=node0umrk1rm6tirb1ht0pvajmxlz532233.node0");
		driver.findElement(By.xpath(("//button[@id='j_idt87:j_idt89']"))).click();
		WebElement path=driver.findElement(By.xpath(("//button[@id='j_idt87:j_idt90']")));
		System.out.println(path.getText());
		path.click();



	}

}
