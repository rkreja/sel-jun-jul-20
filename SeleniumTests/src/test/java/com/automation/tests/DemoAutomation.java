package com.automation.tests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		webdriver.get("http://www.automationpractice.com");//navigation
		
		//click on t-shirt button
		webdriver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a")).click();
		
		
		//click on a button to view product as list
		webdriver.findElement(By.cssSelector("#list > a > i")).click();
		
		
		//enter text in searchbox
		webdriver.findElement(By.cssSelector("#search_query_top")).sendKeys("Summer Dress");
		
		
	}

}
