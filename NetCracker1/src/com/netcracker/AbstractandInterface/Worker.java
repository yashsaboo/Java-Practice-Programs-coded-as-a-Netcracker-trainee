package com.netcracker.AbstractandInterface;

public class Worker implements HR {
	/* (non-Javadoc)
	 * @see com.netcracker.AbstractandInterface.HR#recruit()
	 */
	@Override
	public void recruit()
	{
		System.out.println("Recruiting");
	}
	/* (non-Javadoc)
	 * @see com.netcracker.AbstractandInterface.HR#appraisal()
	 */
	@Override
	public void appraisal()
	{
		System.out.println("Appraisal");
	}
	public void creditAmount()
	{
		System.out.println("Crediting the amount");
	}
	public void work()
	{
		System.out.println("Coding");
	}
	
}
