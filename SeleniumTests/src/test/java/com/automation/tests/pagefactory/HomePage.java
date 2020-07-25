package com.automation.tests.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement button_signin;
	
	
	public HomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}


	public void click_signin() {
		button_signin.click();
	}

}
