package com.automationpractice.tests.login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;


public class LoginTest1 extends TestBase{

	
	
	@Test
	public void test1() {
		webDriver.get("http://www.automationpractice.com");
		webDriver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		webDriver.findElement(By.cssSelector("#email")).sendKeys("abc213@mailinator.com");
		webDriver.findElement(By.cssSelector("#passwd")).sendKeys("abc1234");
		webDriver.findElement(By.cssSelector("#SubmitLogin > span")).click();
		
		String mpi = webDriver.findElement(By.xpath("//span[text()='My personal information']")).getText();
		Assert.assertEquals(mpi, "MY PERSONAL INFORMATION");
	}
	
	

	@Test
	public void test2() {
		webDriver.get("http://www.timeandtraining.net");
	}
	

	@Test
	public void test3() {

		
		webDriver.get("http://www.timeandtraining.net");
	}

}
