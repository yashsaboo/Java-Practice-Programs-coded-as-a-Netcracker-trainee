package com.netcracker.shapes;

public class Area {
	public static void main(String args[])
	{
		Circle c2 = new Circle(4.5f);
		c2.PrintRadius();
		System.out.println("Area: "+c2.calculateCircleArea());
	}
}
