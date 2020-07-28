package com.automation.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import net.timentraining.core.TestBase;

public class Profile  extends TestBase{
	
public void Change_password()  {
		
		
//Training Keyword :-  for loop; if statement; try catch block; try catch finally block
		
		
//Go to http://www.automationpractice.com
webdriver.get("http://www.automationpractice.com");
		
//Click Sign in button from top right corner of the page
webdriver.findElement(By.xpath("//a[@class='login']")).click();
		
//	Enter valid email address 'abc213@mailinator.com' in email address text field of right side
webdriver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc213@mailinator.com");
		
//Enter valid password 'abc1234' in password text field
webdriver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("xyz1234");
		
//Click 'Sign in' button
webdriver.findElement(By.xpath("//span[parent::button[@id='SubmitLogin']]")).click();
		
//Click on name 'Misir Ali' from top right corner
//webdriver.findElement(By.xpath("//span[text()='Misir Ali']")).click();
		
//	Click on button 'MY PERSONAL INFORMATION'
webdriver.findElement(By.xpath("//span[text()='My personal information']")).click();
		
//Enter current password as 'abc1234'
webdriver.findElement(By.id("old_passwd")).sendKeys("xyz1234");
		
//Enter new password as 'xyz1234' in new password text field
webdriver.findElement(By.id("passwd")).sendKeys("abc1234");
		 
//Click 'Save' button
webdriver.findElement(By.xpath("(//span[parent::button[@type='submit']])[2]")).click();
		
//Verify error message displayed 'There is 1 error'
Assert.assertEquals(webdriver.findElement(By.xpath("//p[text()='There is 1 error']")).getText(), "There is 1 error");
		
//Verify error message displayed 'The password and confirmation do not match.'
 
Assert.assertEquals(webdriver.findElement(By.xpath("//li[contains(text(),'The password')]")).getText(), "The password and confirmation do not match.");

//Enter current password as 'abc1234'
webdriver.findElement(By.id("old_passwd")).sendKeys("xyz1234");
		
//Enter new password as 'xyz1234' in new password text field
webdriver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abc1234");
		
//Enter same password 'xyz1234' in confirmation text field
webdriver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("abc1234");
		
//Click 'Save' button
 webdriver.findElement(By.xpath("//span[parent::button[@name='submitIdentity']]")).click();

//Verify success message displayed 'Your personal information has been successfully updated.'

WebElement verify=	webdriver.findElement(By.xpath("//p[@class='alert alert-success']"));
 String message =	verify.getText();
 System.out.println(message);
            
//Click on name 'Misir Ali' from top right corner
webdriver.findElement(By.xpath("//span[text()='Misir Ali']")).click();

//Click on button 'MY PERSONAL INFORMATION'
webdriver.findElement(By.xpath("//span[text()='My personal information']")).click();

//Enter current password as 'xyz1234'
webdriver.findElement(By.id("old_passwd")).sendKeys("abc1234");

//Enter new password as 'abc1234' in new password text field
webdriver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("xyz1234");
//Enter same password 'abc1234' in confirmation text field
webdriver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("xyz1234");

//Click 'Save' button
webdriver.findElement(By.xpath("//span[parent::button[@name='submitIdentity']]")).click();

//Verify success message displayed 'Your personal information has been successfully updated.'
WebElement verifymsg=	webdriver.findElement(By.xpath("//p[@class='alert alert-success']"));
String messages =	verifymsg.getText();
System.out.println(messages);
	}

}
