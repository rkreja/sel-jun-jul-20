package com.automation.tests.switches;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class SwitchToWindows extends TestBase{
	
	
	
	@Test
	public void switch_window() {
		
		webDriver.get("http://testleaf.herokuapp.com/pages/Window.html");
		String mainHandle = webDriver.getWindowHandle();
		
		
		webDriver.findElement(By.id("home")).click();
	

		Set<String> all_handles = webDriver.getWindowHandles();
		
		for(String handle:all_handles) {
			
			System.out.println(handle);
			if(handle.equals(mainHandle)) {
				//
			}else {
				webDriver.switchTo().window(handle);
			}
		}
		
		
		
		
		WebElement new_window_button = webDriver.findElement(By.xpath("//a[@href='pages/Image.html']"));
		
		
		new_window_button.click();
		
	}

}
