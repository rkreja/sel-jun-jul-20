package com.automation.tests.pagefactory;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class LoginTests extends TestBase {

	@Test
	public void Login_with_invalid_userid() {
		webDriver.get("http://www.automationpractice.com");
		
		HomePage homePage = new HomePage(webDriver);
		homePage.click_signin();
		//webDriver.findElement(By.xpath("//a[@class='login']")).click();
		SignInPage signInPage = new SignInPage(webDriver);
		signInPage.enter_email_address("mdmohiuddin1263@gmail.com");
		signInPage.click_sign_in_button();
		String actulmsg = signInPage.get_error_msgs();
		Assert.assertEquals(actulmsg.contains("There is 1 error"), true);
		Assert.assertEquals(actulmsg, "Password is required.");
	
	}
	
	@Test 
	public void Login_with_valid_userid_but_invalid_password() {
		webDriver.get("http://www.automationpractice.com");
		HomePage homePage = new HomePage(webDriver);
		homePage.click_signin();

		SignInPage signInPage = new SignInPage(webDriver);
		signInPage.enter_email_address("mdmohiuddin1263@gmail.com");
		signInPage.click_sign_in_button();
		
		String actulmsg = signInPage.get_error_msgs();
//		System.out.println(actulmsg);
		
		Assert.assertEquals(actulmsg.contains("There is 1 error"), true);
		Assert.assertEquals(actulmsg.contains("Password is required."), true);
		
		
	}
	
	@Test(groups = "smoke")
	public void Login_with_valid_userid_and_password() {
		webDriver.get("http://www.automationpractice.com");
		HomePage homePage = new HomePage(webDriver);
		homePage.click_signin();
		
		SignInPage signInPage = new SignInPage(webDriver);
		signInPage.enter_email_address("mdmohiuddin1263@gmail.com");
		signInPage.enter_password("Mohin1263@");
		signInPage.click_sign_in_button();

		MyAccountPage myAccountPage = new MyAccountPage(webDriver);
		String account = myAccountPage.get_headline();
		Assert.assertEquals(account, "MY ACCOUNT");
		
		String verify = "Welcome to your account. Here you can manage all of your personal information and orders.";
		String welcometo = myAccountPage.get_welcome_message();
		Assert.assertEquals(welcometo, verify);

		boolean is_my_personal_inf_tab_displayed = myAccountPage.check_my_personal_information_tab_displayed();
		Assert.assertEquals(is_my_personal_inf_tab_displayed, true);
		
		myAccountPage.click_logout();

	}

}

