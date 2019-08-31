package com.netcracker.shapes;

public class Circle {
	private float radius;
	protected double PI;
	public Circle() { //Contructor1
		radius = 1.5f;
		PI = 3.14;
	}
	protected Circle(float radius) { //Contructor2
		this(radius, 3.14f);
		this.radius = radius;
	}
	
	private Circle(float radius, float PI) { //Contructor3
		this.radius = radius;
		this.PI = PI;
	}
	public double getPi() { 
		return PI;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void PrintRadius() //Prints the radius
	{
		System.out.println("Radius: "+radius);
	}
	public double calculateCircleArea(){
		return PI*radius*radius;
	}
	public double calculateCircumference(){
		return 2*PI*radius;
	}
}
