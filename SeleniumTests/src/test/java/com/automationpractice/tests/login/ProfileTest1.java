package com.automationpractice.tests.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProfileTest1 {
	
	WebDriver webDriver;
	
	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser() {
		webDriver.quit();
	}
	
	@Test
	public void test1() {

		
		webDriver.get("http://www.timeandtraining.net");
	}
	
	

	@Test
	public void test2() {

		
		webDriver.get("http://www.timeandtraining.net");
	}
	

	@Test
	public void test3() {
	
		
		webDriver.get("http://www.timeandtraining.net");
	}
}
