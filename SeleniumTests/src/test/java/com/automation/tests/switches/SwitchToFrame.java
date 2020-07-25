package com.automation.tests.switches;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class SwitchToFrame extends TestBase{
	
	
	@Test
	public void switchToFrame_1() {
		
		webDriver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		webDriver.switchTo().frame(0);
		
		webDriver.findElement(By.id("Click")).click();
		
		
	}
	
	
	@Test
	public void switchToFrame_nested() {
		
		webDriver.get("http://testleaf.herokuapp.com/pages/frame.html");
		webDriver.switchTo().frame(1);
		webDriver.switchTo().frame("frame2");
		
		webDriver.findElement(By.id("Click1")).click();
		
		
	}

}
