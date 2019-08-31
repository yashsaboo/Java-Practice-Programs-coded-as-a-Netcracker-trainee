package com.netcracker.exceptions;

public class TaxCalculator {
	private String empName;
	private boolean isIndian;
	private double empSal;
	
	public TaxCalculator(String empName, boolean isIndian, double empSal) {
		super();
		this.empName = empName;
		this.isIndian = isIndian;
		this.empSal = empSal;
	}
	public double calculateTax()
	{
		try
		{
			if(isIndian==false)
				throw new CountryNotValidException();
			else if(empName==null)
				throw new EmployeeNameInvalidException();
			else
			{
				if(empSal > 100000)
					return (empSal*8/100);
				else if((empSal < 100000)&&(empSal > 50000))
					return (empSal*6/100);
				else if((empSal < 50000)&&(empSal > 30000))
					return (empSal*5/100);
				else if((empSal < 30000)&&(empSal > 10000))
					return (empSal*6/100);
				else
					throw new TaxNotEligibleException();
			}
		}
		catch(CountryNotValidException e1)
		{
			System.out.println("Country Not Valid Exception");
		}
		catch(EmployeeNameInvalidException e1)
		{
			System.out.println("Employee Name Invalid Exception");
		}
		catch(TaxNotEligibleException e1)
		{
			System.out.println("Tax Not Eligible Exception");
		}
		return 0;
			
	}
	public static void main(String args[])
	{
			TaxCalculator obj = new TaxCalculator("Yash", false, 40000);
			System.out.println("Tax: "+obj.calculateTax());

	}
}
