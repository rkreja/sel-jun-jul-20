package com.automationpractice.tests.howtoread;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read {
	
	
	@Test
	public void read3() {
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		webdriver.get("http://automationpractice.com/");
//		
//		String selenium_button_txt = webdriver.findElement(By.cssSelector("#cmsinfo_block > div:nth-child(1) > ul > li:nth-child(2) > div > p > a")).getText();
//		webdriver.findElement(By.cssSelector("#cmsinfo_block > div:nth-child(1) > ul > li:nth-child(2) > div > p > a")).click();
//		
		WebElement  selenium_button = webdriver.findElement(By.cssSelector("#cmsinfo_block > div:nth-child(1) > ul > li:nth-child(2) > div > p > a"));
		String selenium_button_txt = selenium_button.getText();
		System.out.println(selenium_button_txt);
		selenium_button.click();
		
		
	}
	
	
	@Test
	public void read_welcome_message() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		//Go to http://www.automationpractice.com
		webdriver.get("http://www.automationpractice.com");
		
		//Click Sign in button from top right corner of the page
		webdriver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		
		//Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		webdriver.findElement(By.cssSelector("#email")).sendKeys("abc213@mailinator.com");
		
		//Enter invalid password 'myinvalidpwd' in password text field
		webdriver.findElement(By.cssSelector("#passwd")).sendKeys("abc1234");
		
		//Click 'Sign in' button
		webdriver.findElement(By.cssSelector("#SubmitLogin > span")).click();
		
//		WebElement welcome_msg = webdriver.findElement(By.cssSelector("#center_column > p"));
//		String msg = welcome_msg.getText();
//		System.out.println(msg);
		
		String welcome_msg = webdriver.findElement(By.cssSelector("#center_column > p")).getText();
		System.out.println(welcome_msg);
	}
	
	@Test
	public void readDemo() {
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		webdriver.get("http://automationpractice.com/index.php");
		WebElement contact_us_button  = webdriver.findElement(By.cssSelector("#contact-link > a"));
		
		String contact_us_button_text = contact_us_button.getText();
		
		System.out.println(contact_us_button_text);
		
		WebElement women_button = webdriver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a"));
		String women_button_text = women_button.getText();
		System.out.println(women_button_text);
	}

}
