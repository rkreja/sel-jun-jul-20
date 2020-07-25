package com.automationpractice.tests.testngfeatures.p;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemoCopy {
	
	@BeforeClass
	public void initializeDriver() {
		System.err.println("Creating Driver object");
		System.err.println("Setting timeout");
		System.err.println("Making browser maximized");
	}
	

	
	//@BeforeSuite
	//BeforeTest
	//@BeforeClass
	//@BeforeMethod
	//@Test
	//@AfterMethod
	//@AfterClass
	//AfterTest
	//@AfterSuite
	
	
	@Test
	public void tloginTest() {
		System.out.println("lanuch application");
		System.out.println("click sign in button");
		System.out.println("enter userid");
		System.out.println("enter password");
		System.out.println("click loginbutton");
	}
	
	@Test
	public void loginTwoTest() {
		System.out.println("lanuch application");
		System.out.println("click sign in button");
		System.out.println("enter userid");
		System.out.println("enter password");
		System.out.println("click loginbutton");
	}
	
	@Test
	public void loginThreeTest() {
		System.out.println("lanuch application");
		System.out.println("click sign in button");
		System.out.println("enter userid");
		System.out.println("enter password");
		System.out.println("click loginbutton");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.err.println("Closing the browser");
		
	}
	
	
}
