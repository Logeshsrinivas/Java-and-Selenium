package com.pomWithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	By homePageText = By.xpath("//h6[text()='Dashboard']");
			
	
	// Constructor to initialize the driver
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	// get title is a getter method
	public String getTitle() {
		return driver.findElement(homePageText).getText();
	}

}
