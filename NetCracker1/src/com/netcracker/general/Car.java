package com.netcracker.general;

public class Car {
	private String registrationNumber;
	private String companyName;
	private String modelName;
	private double price;
	private int speed;
	private boolean airConditioner;
	
	//Constructors
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String registrationNumber, String companyName, String modelName, double price, int speed,
			boolean airConditioner) {
		super();
		this.registrationNumber = registrationNumber;
		this.companyName = companyName;
		this.modelName = modelName;
		this.price = price;
		this.speed = speed;
		this.airConditioner = airConditioner;
	}
	
	//Getters and Setters
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getModelName() {
		return modelName;
	}
	public double getPrice() {
		return price;
	}
	public int getSpeed() {
		return speed;
	}
	public boolean isAirConditioner() {
		return airConditioner;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setAirConditioner(boolean airConditioner) {
		this.airConditioner = airConditioner;
	}
	
	//Business Class
	
	public void accelerate()
	{
		this.speed+=5;
	}
	
	public static void main(String[] args) {
		
	}
	

}
