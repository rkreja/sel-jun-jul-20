package com.automation.tests.testngparameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class DataDrivenTest extends TestBase{
	
	
	@DataProvider(name = "flight data")
	public String[][] generate_flight_test_data() {
		String[][] data = {
				{"1","JFK","LHR","07252020","false"},
				{"3","DFW","ATL","07172020","false"},
				{"4","ARN","LGW","08132020","true"},
				{"6","DXB","DHK","09122020","true"},
				{"12","LHR","LGA","02032021","true"},
				{"2","MIS","FRN","09142020","false"},
				{"5","MIA","FLD","05232021","false"}
				
				
		};
		
		return data;
	}
	
	
	@Test(dataProvider = "flight data")
//	@Parameters({"numberOfPassenger","departureAirport","arrivalAirport","flightDate","oneWay"})
	
	public void flight_reservation(String numOfPass, String dep, String arv, String flightDate, String oneway) {
		
		System.out.println("Creating a flight reservation");
		System.out.println("Number of passenger: "+ numOfPass);
		System.out.println("Depart from: "+ dep);
		System.out.println("Arrival to: "+ arv);
		System.out.println("Flight date: "+ flightDate);
		System.out.println("OneWay: "+ oneway);
		
	}
	
	
	/*
	 * @Test
	 * 
	 * @Parameters({"numberOfPassenger","departureAirport","arrivalAirport",
	 * "flightDate","oneWay"}) public void flight_reservation(int numOfPass, String
	 * dep, String arv, String flightDate, boolean oneway) {
	 * 
	 * System.out.println("Creating a flight reservation");
	 * System.out.println("Number of passenger: "+ numOfPass);
	 * System.out.println("Depart from: "+ dep); System.out.println("Arrival to: "+
	 * arv); System.out.println("Flight date: "+ flightDate);
	 * System.out.println("OneWay: "+ oneway);
	 * 
	 * }
	 */
	

}
