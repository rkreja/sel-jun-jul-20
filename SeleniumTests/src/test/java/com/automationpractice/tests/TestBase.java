package com.automationpractice.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public EventFiringWebDriver webDriver;
//	public WebDriver eventFiringWebDriver;
	
	@BeforeMethod
	public void openBrowser() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		webDriver.manage().window().maximize();
		
		webDriver = new EventFiringWebDriver(driver);
	}
	
	@AfterMethod
	public void closeBrowser() {
		webDriver.quit();
	}
	

}
