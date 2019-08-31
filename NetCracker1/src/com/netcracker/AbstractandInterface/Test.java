package com.netcracker.AbstractandInterface;

public class Test {
	public static void main(String args[])
	{
		HR hr = new Worker();
		hr.appraisal();
		hr.recruit();
		/* This protects the Worker class by making HR interface and implementing Polymorphic reference. 
		 * 'hr' can only implents the appraisal and recruit methods because HR reference is given. 
		 * This protects the other methods that is work and creditSalary
		 */
	}
}
