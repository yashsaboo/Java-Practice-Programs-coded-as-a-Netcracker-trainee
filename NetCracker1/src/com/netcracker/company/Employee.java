package com.netcracker.company;

public abstract class Employee {
	private long employeeid;
	private String employeeName;
	private String employeeaddress;
	private long employeePhone;
	private double basicSalary;
	private double specialAllowance;
	private double Hra;
	public Employee() {
		specialAllowance = 250.80;
		Hra = 1000.50;
	}
	
	public Employee(long employeeid, String employeeName, String employeeaddress, long employeePhone,
			double basicSalary) {
		this();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.employeeaddress = employeeaddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}


	public long getEmployeeid() {
		return employeeid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeeaddress() {
		return employeeaddress;
	}
	public long getEmployeePhone() {
		return employeePhone;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public double getSpecialAllowance() {
		return specialAllowance;
	}
	public double getHra() {
		return Hra;
	}
	
	public abstract double calculateTravelAllowance();
	
	
}
