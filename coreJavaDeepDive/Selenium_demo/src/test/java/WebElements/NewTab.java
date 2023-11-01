package WebElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class NewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("samsung galaxy s23 ultra",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)'])[1]")).click();
		String s = driver.getWindowHandle();
		System.out.println(s);
		Set<String> AllWindow = driver.getWindowHandles();
		System.out.println(AllWindow.size());
		
		for (String string : AllWindow) {
			driver.switchTo().window(string);
			System.out.println(string);
		}
	
//		WebDriver driver1= new ChromeDriver();	
//		driver1.get("https://www.flipkart.com/samsung-galaxy-s23-ultra-5g-green-256-gb/p/itm77dc35f7779a4?pid=MOBGMFFX32WUYXUJ&lid=LSTMOBGMFFX32WUYXUJEUVNIW&marketplace=FLIPKART&q=samsung+galaxy+s23+ultra&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=2ac121ea-9c25-4061-a6a0-fabdbcca7ab1.MOBGMFFX32WUYXUJ.SEARCH&ppt=hp&ppn=homepage&ssid=is2rxy7q8g0000001697432438080&qH=0ff6a1b200835c93");
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]")).click();
		driver.switchTo().window(s);
		}

}
