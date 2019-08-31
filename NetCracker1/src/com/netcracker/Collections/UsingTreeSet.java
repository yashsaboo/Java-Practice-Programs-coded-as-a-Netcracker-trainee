package com.netcracker.Collections;

import java.util.Set;
import java.util.TreeSet;

public class UsingTreeSet {
	public static void main(String args[])
	{
		Set<Student> batch1 = new TreeSet<>(); //Increasing Order of Roll number
		batch1.add(new Student(170, "Yash", "Mumbai"));
		batch1.add(new Student(169, "Jennifer", "New Jersey"));
		batch1.add(new Student(168, "Mike", "LA"));
		System.out.println(batch1);
		
		Set<Student> batch2 = new TreeSet<>(new CityComparator()); //Increasing Order of City
		batch2.add(new Student(170, "Yash", "Mumbai"));
		batch2.add(new Student(169, "Jennifer", "Jersey"));
		batch2.add(new Student(168, "Mike", "LA"));
		System.out.println(batch2);
		
		Set<Student> batch3 = new TreeSet<>(new NameComparator()); //Increasing Order of Names
		batch3.add(new Student(170, "Yash", "Mumbai"));
		batch3.add(new Student(169, "Jennifer", "Jersey"));
		batch3.add(new Student(168, "Mike", "LA"));
		System.out.println(batch3);
		
	}
}
