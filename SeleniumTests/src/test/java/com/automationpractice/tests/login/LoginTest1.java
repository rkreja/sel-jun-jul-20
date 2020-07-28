package com.automationpractice.tests.login;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.inheritanceforallclassandpakges.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Logintests extends net.timentraining.core.TestBase{



@Test
public void Login_with_invalid_userid() {
//Training Keyword:Basic selenium usage


//Go to http://www.automationpractice.com
webdriver.get("http://www.automationpractice.com");

//Click Sign in button from top right corner of the page
webdriver.findElement(By.xpath("//a[@class='login']")).click();


//Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
webdriver.findElement(By.xpath("//input[@id='email']")).sendKeys("myunknowxaad@mailinator.com");
//Click Sign in button
webdriver.findElement(By.xpath("//span[parent::button[@id='SubmitLogin']]")).click();

//Verify error message displayed 'There is 1 error'
String actulmsg =webdriver.findElement(By.xpath("//p[text()='There is 1 error']")).getText();
   //// Assert.assertEquals(actulmsg, "There is 1 error");
//System.out.println(actulmsg);
    Assert.assertEquals(webdriver.findElement(By.xpath("//p[text()='There is 1 error']")).getText(), "There is 1 error");

//Verify error message displayed 'Password is required.'
String actulms= webdriver.findElement(By.xpath(" //li[ancestor::div[@class='alert alert-danger']]")).getText();
Assert.assertEquals(actulms, "Password is required.");
//System.out.println(actulms);

}



@Test // Add Test library and import org.testng.annotations.Test
public void Login_with_valid_userid_but_invalid_password() {


//Go to http://www.automationpractice.com
webdriver.get("http://www.automationpractice.com");

//Click Sign in button from top right corner of the page
webdriver.findElement(By.xpath("//a[@class='login']")).click();

//Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
webdriver.findElement(By.xpath("//input[@id='email']")).sendKeys("myunknowxaad@mailinator.com");

//Enter invalid password 'myinvalidpwd' in password text field
webdriver.findElement(By.id("passwd")).sendKeys("myinvalidpwd");
//Click Sign in button
webdriver.findElement(By.xpath("//span[parent::button[@id='SubmitLogin']]")).click();

//Verify error message displayed 'There is 1 error'
String actulmsg =webdriver.findElement(By.xpath("//p[text()='There is 1 error']")).getText();
    //// Assert.assertEquals(actulmsg, "There is 1 error");
//System.out.println(actulmsg);
     Assert.assertEquals(webdriver.findElement(By.xpath("//p[text()='There is 1 error']")).getText(), "There is 1 error");

//Verify error message displayed 'Authentication failed.'
String actulms= webdriver.findElement(By.xpath(" //li[ancestor::div[@class='alert alert-danger']]")).getText();
Assert.assertEquals(actulms, "Password is required.");
//System.out.println(actulms);


}


@Test  (groups="smoke")
public void Login_with_valid_userid_and_password() {


//Go to http://www.automationpractice.com
webdriver.get("http://www.automationpractice.com");

//Click Sign in button from top right corner of the page
webdriver.findElement(By.xpath("//a[@class='login']")).click();

//Enter valid email address 'abc213@mailinator.com' in email address text field of right side
webdriver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc213@mailinator.com");

//Enter valid password 'abc1234' in password text field
webdriver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abc1234");

//Click 'Sign in' button
webdriver.findElement(By.xpath("//i[@class='icon-lock left']")).click();

//Verify 'MY ACCOUNT' text displayed//we use Assert and red

String account =webdriver.findElement(By.xpath("//h1[text()='My account']")).getText();

Assert.assertEquals(account, "MY ACCOUNT");
System.out.println(account);

//Welcome to your account. Here you can manage all of your personal information and orders.
//For Red we use Webelement
WebElement welcome =webdriver.findElement(By.xpath("//p[@class='info-account']"));
String welcomemsg=welcome.getText();
//System.out.println(welcomemsg);

//Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
String welcometo=webdriver.findElement(By.xpath("//p[@class='info-account']")).getText();
String verify="Welcome to your account. Here you can manage all of your personal information and orders.";
Assert.assertEquals(welcometo, verify);
System.out.println(verify);

//Verify 'My personal information' text displayed
WebElement  verifytext= webdriver.findElement(By.xpath("//span[preceding-sibling::i[@class='icon-user']]"));
String my= verifytext.getText();
Assert.assertEquals(my, "MY PERSONAL INFORMATION");

//System.out.println(my);

//Click 'Sign out' button from top right corner
webdriver.findElement(By.xpath("//a[@class='logout']")).click();

}

}