package com.automationpractice.tests.login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class LoginTests extends TestBase{
	
	
	@Test
   public void Login_with_valid_userid_but_invalid_password() {
		
		//Go to http://www.automationpractice.com
		webDriver.get("http://www.automationpractice.com");
		
		//Click Sign in button from top right corner of the page
		webDriver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		
		//Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		webDriver.findElement(By.cssSelector("#email")).sendKeys("abc213@mailinator.com");
		
		//Enter invalid password 'myinvalidpwd' in password text field
		webDriver.findElement(By.cssSelector("#passwd")).sendKeys("myinvalidpwd");
		
		//Click 'Sign in' button
		webDriver.findElement(By.cssSelector("#SubmitLogin > span")).click();
		
		//Verify error message displayed 'There is 1 error'
		String errMsg1 = webDriver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > p")).getText();
//		System.out.println(errMsg1);
		Assert.assertEquals(errMsg1, "There is 1 error");
		
		//Verify error message displayed 'Authentication failed.'
		String errMsg2 = webDriver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
		Assert.assertEquals(errMsg2, "Authentication failed.");
		
	}
	@Test(groups = "smoke")
	public void Login_with_invalid_userid() {
		
	
		
		
		//Go to http://www.automationpractice.com
		webDriver.get("http:/www.automationpractice.com");
		
		//Click Sign in button from top right corner of the page
		webDriver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		
		//Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
		webDriver.findElement(By.cssSelector("#email")).sendKeys("myunknowxaad@mailinator.com");

		//Click Sign in button
		webDriver.findElement(By.cssSelector("#SubmitLogin > span")).click();
		//Verify error message displayed 'There is 1 error'
		//Verify error message displayed 'Password is required.'
		
	}


	

}
