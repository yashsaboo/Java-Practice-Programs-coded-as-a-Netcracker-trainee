package com.netcracker.exceptions.caseStudyOfVehicles;

public enum VehicleType {
	Bicycle(5), Bike(10), Auto(15), Car(20), Bus(30), Truck(35);
	
	private int ratePerHour;

	private VehicleType(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public int getRatePerHour() {
		return ratePerHour;
	}
	
}
