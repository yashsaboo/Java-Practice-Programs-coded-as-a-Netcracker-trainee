package com.netcracker.Collections;

public class Student implements Comparable<Student>{ //If Comparable is not added then TreeSet can;t be implemented
	private int roll;
	private String name;
	private String city;
	
	public Student(int roll, String name, String city){
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int compareTo(Student anotherStudent) {
		return this.roll - anotherStudent.roll;//Keeps the data in increasing order
		//return anotherStudent.roll - this.roll;//Keeps the data in decreasing order
	}
	
	

}
