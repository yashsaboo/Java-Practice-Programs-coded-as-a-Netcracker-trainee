package com.netcracker.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UsingList {

	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List<Comparable> list1 = new ArrayList<Comparable>();
		list1.add(10);
		list1.add("One");
		list1.add(20.6);
		list1.add(new Integer(20));
		
		System.out.println(list1.get(2));
		list1.add(1, 15.5);
		printCollection(list1);
		System.out.println("Do we have 10? "+list1.contains(10));
		list1.remove(1);
		printCollection(list1);
		
		System.out.println();
		
		@SuppressWarnings("rawtypes")
		Set<Comparable> set = new HashSet<Comparable>();
		set.add(10);
		set.add("One");
		set.add(20.6);
		set.add(new Integer(20));
		
		//System.out.println(set.get(2)); //Index Operations doesn't Work
		//set.add(1, 15.5); //Index Operations doesn't Work
		printCollection(set);
		System.out.println("Do we have 10? "+set.contains(10));
		set.remove(1);
		printCollection(set);
		
		System.out.println();
		
		Set<String> set1 = new HashSet<String>();
		//set1.add(10);
		set1.add("One");
		set1.add("Two");
		set1.add("Five");
		//set1.add(20.6);
		//set1.add(new Integer(20));
		
		//System.out.println(set1.get(2)); //Index Operations doesn't Work
		//set1.add(1, 15.5); //Index Operations doesn't Work
		printCollection(set1);
		System.out.println("Do we have 10? "+set1.contains(10));
		set1.remove(1);
		printCollection(set1);
		
		System.out.println();
		
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(10);
		set2.add(1);
		set2.add(3);
		set2.add(2);
		set2.add(20);
		set2.add(new Integer(20));
		
		//System.out.println(set2.get(2)); //Index Operations doesn't Work
		//set2.add(1, 15.5); //Index Operations doesn't Work
		printCollection(set2); //Prints in ascending order because of TreeSet
		System.out.println("Do we have 10? "+set2.contains(10));
		set2.remove(1);
		printCollection(set2);
		
	}
	
	@SuppressWarnings("rawtypes")
	public static void printCollection(Collection c)
	//We made c of Collection type so that any concrete class of Collection can call this method get itself printed.
	{
		System.out.println("Total Object = " + c.size());
		System.out.println(c);
	}
}
