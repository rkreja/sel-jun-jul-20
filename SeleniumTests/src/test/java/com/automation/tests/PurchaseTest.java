package com.automation.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class PurchaseTest extends TestBase{

	
	
	@Test
	public void working_with_multiple_elements() {
		
		webDriver.get("http://automationpractice.com/");
		
		System.out.println("");
		
		List<WebElement> msgHolders =webDriver.findElements(By.xpath("//p[preceding-sibling::p[@class='cheque-indent']]"));
		for(int i=0; i<msgHolders.size(); i++) {
			System.out.println(msgHolders.get(i).getText());
		}
		
//		WebElement lineOne = msgHolders.get(0);
//		WebElement lineTwo = msgHolders.get(1);
//		WebElement lineThree = msgHolders.get(2);
//		System.out.println(lineOne.getText());
//		System.out.println(lineTwo.getText());
//		System.out.println(lineThree.getText());
		
		
	}
	
	
}
