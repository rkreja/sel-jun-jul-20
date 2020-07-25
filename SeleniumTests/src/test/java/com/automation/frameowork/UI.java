package com.automation.frameowork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UI {

	private WebDriver driver;

	public UI(WebDriver driver) {
		this.driver = driver;
	}

	public void open_url(String url) {
		driver.get(url);
	}

	public void click_byId(String id) {
		driver.findElement(By.id(id)).click();
	}

	public void click_byClassName(String className) {
		driver.findElement(By.className(className)).click();
	}

	public void click_byXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public void click_byCssSelector(String cssSelector) {
		driver.findElement(By.cssSelector(cssSelector)).click();
	}
	
	public void type_byId(String id, String textToType) {
		driver.findElement(By.id(id)).sendKeys(textToType);
	}
	public void type_byClassName(String className, String textToType) {
		driver.findElement(By.className(className)).sendKeys(textToType);
	}
	public void type_byXpath(String xpath, String textToType) {
		driver.findElement(By.xpath(xpath)).sendKeys(textToType);
	}
	public void type_byCssSelector(String cssSelector, String textToType) {
		driver.findElement(By.cssSelector(cssSelector)).sendKeys(textToType);
	}
	
	
	
	public String read_byId(String id) {
		return driver.findElement(By.id(id)).getText();
	}
	public String read_byXpath(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}

	
	public void verify_equal(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}
	
	
	
	public void verify_equal(int actual, int expected) {
		Assert.assertEquals(actual, expected);
	}
	
	
	
	public void verify_equal(boolean actual, boolean expected) {
		Assert.assertEquals(actual, expected);
	}
	

	
	
}
