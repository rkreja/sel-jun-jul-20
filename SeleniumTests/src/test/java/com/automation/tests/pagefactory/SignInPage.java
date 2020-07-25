package com.automation.tests.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement textfield_emailaddress;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement textfield_password;
	
	@FindBy(xpath = "//span[parent::button[@id='SubmitLogin']]")
	WebElement button_signin;
	
	@FindBy(className = "alert-danger")
	WebElement errorMsgHolder;
	
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enter_email_address(String email) {
		textfield_emailaddress.sendKeys(email);
	}

	public void enter_password(String pwd) {
		textfield_password.sendKeys(pwd);
	}

	public void click_sign_in_button() {
		button_signin.click();
	}
	
	public String get_error_msgs() {
		String errorMsg = errorMsgHolder.getText();
		return errorMsg;
	}
	

}
