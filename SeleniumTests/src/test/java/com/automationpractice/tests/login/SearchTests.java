package com.automationpractice.tests.login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class SearchTests extends TestBase{
	
	
	@Test
	public void search_by_price() {
		
		webDriver.get("http://www.timeandtraining.net");
	}

}
