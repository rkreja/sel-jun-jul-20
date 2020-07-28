package com.automationpractice.tests.search;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class SearchTests extends TestBase{
	
	@Test(groups = "smoke")
	public void Search_with_filter() {

		
//		Go to http://www.automationpractice.com
		webDriver.get("http://www.automationpractice.com");
		
//		Mouse hover over 'Women' menu
		
//		Click on 'Summer Dresses' Under Dresses section
//		Click on 'White' option from left panel under color
//		Verify text: There is 1 product displayed on right side
//		verify enabled filters option also displayed on left side with 'X' button
//		Click on 'X' button from enabled filters
//		Verify text: There is 3 product displayed on right side
		
		
	}
	
	//TODO
	@Test
	public void Simple_search_and_view_as_grid_and_list() {
		

		
		
		
		//Go to http://www.automationpractice.com
		webDriver.get("http://www.automationpractice.com");
		
		//Enter 'Dress' in search text box on top
		webDriver.findElement(By.cssSelector("#search_query_top")).sendKeys("Dress");
		
		//Click on search button icon
		webDriver.findElement(By.cssSelector("#searchbox > button")).click();
		
		//Select Price: Lowest first option from Sort By Dropdown
		
		//Verify the first product price is: $16.51
		//Select Price: Highest first option from Sort By Dropdown
		//Verify the first product price is: $50.99
		//Select Product name: A to Z option from Sort By Dropdown
		//Verify the first product name is: Blouse
		//Select Product name: Z to A option from Sort By Dropdown
		//Verify the first product name is: Printed Summer Dress
		//Select 'In Stock' option now from Sort By Dropdown
		//Verify 'In Stock' green button appears for all displayed product
	}
	
	

}
