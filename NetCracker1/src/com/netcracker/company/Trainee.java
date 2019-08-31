package com.netcracker.company;

public class Trainee extends Employee {
	public double calculateTravelAllowance() {
		return this.getBasicSalary()*0.1;
	}
	public Trainee(long employeeid, String employeeName, String employeeaddress, long employeePhone,
			double basicSalary) {
		super(employeeid,employeeName, employeeaddress, employeePhone, basicSalary);
	}

	public static void main(String args[])
	{
		//Employee e = new Trainee(15070, "Yash", "Mumbai", 99999999, 5000000);
	}
}
