package com.netcracker.company;

public class Manager extends Employee{
	
	public Manager(long employeeid, String employeeName, String employeeaddress, long employeePhone,
			double basicSalary) {
		super(employeeid,employeeName, employeeaddress, employeePhone, basicSalary);
	}

	public static void main(String args[])
	{
		//Employee e1 = new Manager(15070, "Yash", "Mumbai", 99999999, 5000000);
	}

	@Override
	public double calculateTravelAllowance() {
		return this.getBasicSalary()*0.15;
	}
}
