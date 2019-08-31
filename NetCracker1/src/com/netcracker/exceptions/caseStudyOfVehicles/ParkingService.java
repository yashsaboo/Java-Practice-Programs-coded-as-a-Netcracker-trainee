package com.netcracker.exceptions.caseStudyOfVehicles;

public class ParkingService {

	public double calculateCharges(Customer customer, double hours) {
		
		/*POWER OF ENUM - From Line 8 to Line 24 is replaced by one line on line 25. 
		 * Done by giving properties to enum*/
//		int ratePerHour;
//		if(customer.getVehicle()==VehicleType.Bike)
//		{
//			ratePerHour = 10;
//		}
//		else if(customer.getVehicle()==VehicleType.Car)
//		{
//			ratePerHour = 20;
//		}
//		else if(customer.getVehicle()==VehicleType.Bicycle)
//		{
//			ratePerHour = 5;
//		}
//		else
//		{
//			ratePerHour = 30;
//		}
		return hours*customer.getVehicle().getRatePerHour();
	}

}
