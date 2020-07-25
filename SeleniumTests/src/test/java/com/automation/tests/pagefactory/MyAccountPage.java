package com.automation.tests.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	@FindBy(className = "info-account")
	WebElement welcome_msg_holder;
	
	@FindBy(className = "page-heading")
	WebElement headline;
	
	@FindBy(xpath = "//span[preceding-sibling::i[@class='icon-user']]")
	WebElement tab_my_personal_info;
	
	@FindBy(xpath = "//a[@class='logout']")
	WebElement logout_button;
	
	
	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String get_welcome_message() {
		return welcome_msg_holder.getText();
	}
	
	
	public String get_headline() {
		return headline.getText();
	}
	
	
	public boolean check_my_personal_information_tab_displayed() {
		return tab_my_personal_info.isDisplayed();
	}
	
	public void click_logout() {
		logout_button.click();
	}
	
	
}
