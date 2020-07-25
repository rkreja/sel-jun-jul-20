package com.automationpractice.tests.testngfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertDemo {

	
	
	@Test
	public void mySimpleTest() {
		
	
		boolean active = true;

		Assert.assertEquals(active, false);
		
		
	}
	
	

}
