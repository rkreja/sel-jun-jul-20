package com.automationpractice.tests.testngfeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAndQuit {
	
	
	
	@Test
	public void driverCloseAndQuit() {
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		webdriver.get("http://automationpractice.com/index.php");
		webdriver.findElement(By.cssSelector("#social_block > ul > li.youtube > a")).click();
		webdriver.close();
//		webdriver.get("http://automationpractice.com/index.php");
		
	}

}
