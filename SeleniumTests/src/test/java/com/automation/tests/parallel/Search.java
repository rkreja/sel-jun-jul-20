package com.automation.tests.parallel;

import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class Search extends TestBase{

	@Test
	public void t1() {
		webDriver.get("http://www.cnn.com");
	}
	@Test
	public void t2() {
		webDriver.get("http://www.amzon.com");
	}
	@Test
	public void t3() {
		webDriver.get("http://www.ebay.com");
	}
	@Test
	public void t4() {
		webDriver.get("http://www.netflix.com");
	}
	
}
