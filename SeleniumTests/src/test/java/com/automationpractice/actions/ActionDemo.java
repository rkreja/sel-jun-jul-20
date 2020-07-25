package com.automationpractice.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class ActionDemo extends TestBase{

	@Test(groups = "smoke")
	public void keyPress() {
		
		
		webDriver.get("http://automationpractice.com/index.php");

		WebElement search_text_box = webDriver.findElement(By.id("search_query_top"));
		Actions actions = new Actions(webDriver);
		actions
		.sendKeys(search_text_box, "Summer dress")
		.sendKeys(Keys.ENTER)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER)
		.build().perform();
		
		
	}
	
	
	@Test
	public void dragAndDrop() {
		
		
		webDriver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		WebElement logo = webDriver.findElement(By.id("drag"));
		WebElement box = webDriver.findElement(By.id("drop"));
		
		Actions actions = new Actions(webDriver);
		
//		actions.doubleClick(logo).build().perform();
		
		actions.dragAndDrop(logo, box).build().perform();

		
		
	}
	@Test
	public void mouseHover() throws InterruptedException {
		
		
		webDriver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		
		WebElement redButton = webDriver.findElement(By.xpath("(//li[parent::ul])[1]"));
		Actions actions = new Actions(webDriver);
		actions.moveToElement(redButton).build().perform();
		
		Thread.sleep(1000);
		
		WebElement greenButton = webDriver.findElement(By.xpath("(//li[parent::ul])[2]"));
		actions.moveToElement(greenButton).build().perform();
		
		Thread.sleep(1000);
		
		WebElement blueButton = webDriver.findElement(By.xpath("(//li[parent::ul])[3]"));
		actions.moveToElement(blueButton).build().perform();
		
		
	}

}
