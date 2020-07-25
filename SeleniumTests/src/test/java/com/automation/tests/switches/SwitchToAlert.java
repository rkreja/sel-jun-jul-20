package com.automation.tests.switches;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class SwitchToAlert extends TestBase{

	
	@Test
	public void allert_accept() throws InterruptedException {
		
		webDriver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		webDriver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		webDriver.switchTo().alert().accept();
		
	}
	
}
