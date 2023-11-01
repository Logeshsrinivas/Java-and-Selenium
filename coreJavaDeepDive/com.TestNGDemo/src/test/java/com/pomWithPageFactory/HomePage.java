package com.pomWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
			WebElement homePageText;
	
	// Constructor to initialize the driver
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	// get title is a getter method
	public String getTitle() {
		return homePageText.getText();
	}

}
