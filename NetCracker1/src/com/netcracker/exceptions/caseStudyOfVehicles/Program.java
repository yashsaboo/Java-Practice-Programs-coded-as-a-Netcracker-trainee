package com.netcracker.exceptions.caseStudyOfVehicles;

public class Program {

	public static void main(String args[])
	{
		ParkingService service = new ParkingService();
		
		Customer c1 = new Customer();
		c1.setVehicle(VehicleType.Bike);

		Customer c2 = new Customer();
		c2.setVehicle(VehicleType.Bicycle);

		Customer c3 = new Customer();
		c3.setVehicle(VehicleType.Car);
		
		System.out.println("Amount to pay for c1: "+service.calculateCharges(c1, 3));
		System.out.println("Amount to pay for c2: "+service.calculateCharges(c2, 3));
		System.out.println("Amount to pay for c3: "+service.calculateCharges(c3, 3));
	}

}
