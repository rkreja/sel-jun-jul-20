package com.automation.frameowork.tests;

import java.util.List;

import org.testng.annotations.Test;

import com.automation.frameowork.UI;
//import com.automation.frameowork.UI;
import com.automationpractice.tests.TestBase;

import net.timentraining.core.WebUI;
import net.timentraining.core.io.Excel;
import net.timentraining.core.mail.Gmail;

public class LoginTests extends TestBase{
	
	@Test
	public void test_utily_test() {
		
//		String pwd = TestUtility.generate_random_password(12);
//		System.out.println(TestUtility.);
		
		//time&training
		//timentrainingstudent@gmail.com
		
//		TestUtility.generate_random_password(12);
		
		Gmail gmail = new Gmail("timentrainingstudent@gmail.com", "time&training");
		String latest_email = gmail.get_most_recent_email();
		gmail.ComposeEmail("timentrainingstudent@gmail.com", "testing compose", "from framework");
		
		
		
	}
	
	@Test
	public void data_driven_test() {
		
		Excel excel = new Excel("F:\\Time And Training\\Demo Folder\\r.xls", "Sheet1");
		
		String cityName = excel.getCellValue(2, 2);
		System.out.println(cityName);
		
		boolean b = excel.checkValueIsInCell(1, 3, "987 abc street");
		System.out.println(b);
		
		int col = excel.columnCount();
		
		List<String> all_city_names = excel.getAllRowValuesByColumn(2);
		
		for(int i=0; i< all_city_names.size(); i++) {
			System.out.println((i+1) + " : " + all_city_names.get(i));
		}
	}	
	
	
	@Test
	public void login_with_valid_userid_and_password() {
		UI ui = new UI(webDriver);
		ui.open_url("http://www.automationpractice.com");
		ui.click_byClassName("login");
		ui.type_byId("email", "abc213@mailinator.com");
		ui.type_byId("passwd", "xyz1234");
		ui.click_byId("SubmitLogin");
		String msg = ui.read_byXpath("//p[@class='info-account']");
		ui.verify_equal(msg, "Welcome to your account. Here you can manage all of your personal information and orders.");

	}
	
	@Test
	public void login_with_valid_userid_and_password_2() {
		
		WebUI webUI = new WebUI(webDriver);
		webUI.launch("http://www.automationpractice.com");
		webUI.click_element_by_className("login");
		webUI.enter_text_by_id("email", "abc213@mailinator.com");
		webUI.enter_text_by_id("passwd", "xyz1234");
		webUI.click_element_by_id("SubmitLogin");
		
		
	}

}
