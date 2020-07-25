package com.automation.tests.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class LoginTestsWithoutPageFactory extends TestBase{
	@Test
	public void Login_with_invalid_userid() {
		webDriver.get("http://www.automationpractice.com");
		webDriver.findElement(By.xpath("//a[@class='login']")).click();
		webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("mdmohiuddin1263@gmail.com");
		webDriver.findElement(By.xpath("//span[parent::button[@id='SubmitLogin']]")).click();
		String actulmsg = webDriver.findElement(By.xpath("//p[text()='There is 1 error']")).getText();
		Assert.assertEquals(webDriver.findElement(By.xpath("//p[text()='There is 1 error']")).getText(),
				"There is 1 error");
		String actulms = webDriver.findElement(By.xpath(" //li[ancestor::div[@class='alert alert-danger']]")).getText();
		Assert.assertEquals(actulms, "Password is required.");

	}

	@Test 
	public void Login_with_valid_userid_but_invalid_password() {
		webDriver.get("http://www.automationpractice.com");
		webDriver.findElement(By.xpath("//a[@class='login']")).click();
		webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("mdmohiuddin1263@gmail.com");
		webDriver.findElement(By.xpath("//span[parent::button[@id='SubmitLogin']]")).click();
		String actulmsg = webDriver.findElement(By.xpath("//p[text()='There is 1 error']")).getText();
		Assert.assertEquals(webDriver.findElement(By.xpath("//p[text()='There is 1 error']")).getText(),
				"There is 1 error");
		String actulms = webDriver.findElement(By.xpath(" //li[ancestor::div[@class='alert alert-danger']]")).getText();
		Assert.assertEquals(actulms, "Password is required.");

	}

	@Test(groups = "smoke")
	public void Login_with_valid_userid_and_password() {
		webDriver.get("http://www.automationpractice.com");
		webDriver.findElement(By.xpath("//a[@class='login']")).click();
		webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("mdmohiuddin1263@gmail.com");
		webDriver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Mohin1263@");
		webDriver.findElement(By.xpath("//i[@class='icon-lock left']")).click();

		String account = webDriver.findElement(By.xpath("//h1[text()='My account']")).getText();
		Assert.assertEquals(account, "MY ACCOUNT");
		System.out.println(account);
		WebElement welcome = webDriver.findElement(By.xpath("//p[@class='info-account']"));
		String welcomemsg = welcome.getText();
		String welcometo = webDriver.findElement(By.xpath("//p[@class='info-account']")).getText();
		String verify = "Welcome to your account. Here you can manage all of your personal information and orders.";
		Assert.assertEquals(welcometo, verify);
		System.out.println(verify);
		WebElement verifytext = webDriver.findElement(By.xpath("//span[preceding-sibling::i[@class='icon-user']]"));
		String my = verifytext.getText();
		Assert.assertEquals(my, "MY PERSONAL INFORMATION");
		webDriver.findElement(By.xpath("//a[@class='logout']")).click();

	}
}
