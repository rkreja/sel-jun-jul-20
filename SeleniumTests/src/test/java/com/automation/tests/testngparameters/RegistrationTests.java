package com.automation.tests.testngparameters;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class RegistrationTests extends TestBase{
	
	
	
	@Test
	@Parameters({"loginUserId","loginUserPwd"})
	public void login(String userId, String pwd) {
		webDriver.get("http://www.automationpractice.com");
		webDriver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		webDriver.findElement(By.cssSelector("#email")).sendKeys(userId);
		webDriver.findElement(By.cssSelector("#passwd")).sendKeys(pwd);
		webDriver.findElement(By.cssSelector("#SubmitLogin > span")).click();
		
		String mpi = webDriver.findElement(By.xpath("//span[text()='My personal information']")).getText();
		Assert.assertEquals(mpi, "MY PERSONAL INFORMATION");
	}
	
	@Test
	@Parameters({"firstName","lastName","emailId","password","phone"})
	public void register_a_user(
			String firstName,
			String lastName,
			String emailId,
			String password,
			String phone) {
		
		
		
		System.out.println("****** REGISTERING A USER *******");
		
		
		
		
		System.out.println("firstname: "+ firstName);
		System.out.println("lastname: "+ lastName);
		System.out.println("emailId: "+ emailId);
		System.out.println("pwassword: "+ password);
		System.out.println("phone: "+ phone);
		
		
		
	}

}
