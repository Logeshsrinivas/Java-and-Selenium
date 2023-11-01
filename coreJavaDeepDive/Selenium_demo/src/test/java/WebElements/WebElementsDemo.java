package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class WebElementsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("The page title is:"+driver.getTitle());
		System.out.println("The current URL is :"+driver.getCurrentUrl());
		
		WebElement phoneNo =driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']"));
		phoneNo.sendKeys("9952008803");
//		phoneNo.clear();
		
		WebElement otp = driver.findElement(By.xpath("//button[@class='_1wGnMD rX1XT4 _2nD2xJ']"));
		String otp1 = otp.getText();
		String color =otp.getCssValue("color");
		otp.click();
		boolean a =otp.isDisplayed();
		boolean b= otp.isEnabled();
		boolean c =otp.isSelected();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		Dimension d=otp.getSize();
		System.out.println(d);
		Point p =otp.getLocation();
		System.out.println(p);
		System.out.println(otp.getTagName());
System.out.println(color);

		System.out.println("The visible text is:"+otp1);
	}

}
