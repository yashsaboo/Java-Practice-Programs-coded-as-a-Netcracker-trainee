package com.netcracker.general;

public class WrapperClass {
	public static void main(String args[])
	{
		int x = 20;
		Integer z = x;
		x = z;
		System.out.println(x); //Autoboxing
		System.out.println(z); //Unboxing
	}
}
