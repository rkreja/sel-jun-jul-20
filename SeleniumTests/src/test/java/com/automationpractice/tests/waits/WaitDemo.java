package com.automationpractice.tests.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class WaitDemo extends TestBase{
	
	
	@Test
	public void explicitDemo1() throws InterruptedException  {
		webDriver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
//		Thread.sleep(10000);
		WebElement quotationHolder = webDriver.findElement(By.id("explicitWaitTextPresentDemo"));
		
		WebDriverWait wait = new WebDriverWait(webDriver, 65);
		wait.until(ExpectedConditions.textToBePresentInElement(quotationHolder, "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”"));
		
		String quote = quotationHolder.getText();
		System.out.println(quote);
		Assert.assertEquals(quote, "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”");
		
	}

}
