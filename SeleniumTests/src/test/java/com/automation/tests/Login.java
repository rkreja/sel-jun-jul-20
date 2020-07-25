package com.automation.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//goto automation practice.com
		webdriver.get("http:/www.automationpractice.com");
		
		//Click Sign in button from top right corner of the page
		webdriver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		
		//Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
		webdriver.findElement(By.cssSelector("#email")).sendKeys("myunknowxaad@mailinator.com");
		
		
		//Click Sign in button
		webdriver.findElement(By.cssSelector("#SubmitLogin > span")).click();
		
		
	}
	
	
	
	
	


}
