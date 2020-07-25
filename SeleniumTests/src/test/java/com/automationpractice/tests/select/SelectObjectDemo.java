package com.automationpractice.tests.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectObjectDemo {
	
	@Test
	public void findElements() {
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		webdriver.get("https://www.amazon.com");
		
		List<WebElement> all_links = webdriver.findElements(By.tagName("a"));
		
		
		WebElement firstLink = all_links.get(0);
		WebElement secondLink = all_links.get(1);
		System.out.println("Total link in this page is: "+ all_links.size());
		System.out.println("1: = "+ firstLink.getAttribute("href"));
		System.out.println("2: = "+ secondLink.getAttribute("href"));
		
		for(int i=0; i<all_links.size();i++) {
			WebElement link = all_links.get(i);
			System.out.println(i+ ": = "+ link.getAttribute("href"));
		}
		
		
	}
	
	
	@Test
	public void demo() {
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		webdriver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		WebElement e = webdriver.findElement(By.name("DemoDropDown"));
		Select dropdown = new Select(e);
//		dropdown.selectByValue(value);
		
		
		
	}
	
	@Test
	public void demoReadingAllOptionsFromDropDown() {
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		webdriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		webdriver.findElement(By.id("email_create")).sendKeys("dsdsdfs@gmail.com");
		webdriver.findElement(By.id("SubmitCreate")).click();
		
		WebElement e = webdriver.findElement(By.id("id_state"));
		Select sate_dropdown = new Select(e);
		sate_dropdown.selectByValue("32");
		
		List<WebElement> allStateNames = sate_dropdown.getOptions();
		
		
		for(int i=0; i<allStateNames.size(); i++) {
			WebElement state = allStateNames.get(i);
			String stateName = state.getText();
			System.err.println(stateName);
			
			if(stateName.equals("Kentucky")) {
				Assert.fail();
			}			
			
		}
		
		
	}

}
