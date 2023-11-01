package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url ="https://www.flipkart.com/";
		driver.get(url);
		String title = driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
		Class<? extends WebDriver> className = driver.getClass();
		System.out.println("PageTitle: "+title);
		System.out.println("PageTitle Length: "+title.length());
		System.out.println("currentURL: "+currentURL);
//		System.out.println("page source: "+pageSource);
//		System.out.println("page source Length: "+pageSource.length());
		System.out.println("className: "+className);
		if(url.equalsIgnoreCase(currentURL)) {
			System.out.println("Correct page opened");
		}else {
			System.out.println("Incorrecrt page opened");
		}
//		driver.close();		

	
		}
}
