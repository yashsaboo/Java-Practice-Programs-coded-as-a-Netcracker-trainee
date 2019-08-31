package com.netcracker.Collections;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ProblemStatement1 {
	public static List<Integer> storeEvenNumbers(int end)
	{
		List<Integer> l1 = new ArrayList<Integer>();
		for(int i=2;i<end;i=i+2)
		{
			l1.add(i);
		}
		return l1;
	}
	
	public static void printDoubleEvenNumbers()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		List<Integer> result = storeEvenNumbers(n);
		System.out.println(result);
		for(Integer i : result)
		{
			System.out.print(i*2 + " ");
		}
		System.out.println();
	}
	
	public static void printEvenNumbersUsingIterations()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		List<Integer> result = storeEvenNumbers(n);
		
		//Normal Way
		System.out.println(result);
		
		System.out.println();
		
		//For Loop
		for(int index = 0; index<result.size(); index++)
			System.out.print(result.get(index)+ " ");
		
		System.out.println();
		
		//For Each Loop
		for(Integer index : result )
			System.out.print(index + " ");
		
		System.out.println();
		
		//Iterator
		Iterator<Integer> it = result.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		
		System.out.println();
		
		//ListInterator
		ListIterator<Integer> lit = result.listIterator(result.size());
		//We have the pointer to the LitIterstor to last index so that we can print the list from last element
		while(lit.hasPrevious())
			System.out.print(lit.previous() + " ");
	}
	
	public static Integer findNumber(Integer searchNumber, List<Integer> list)
	{
		return list.contains(searchNumber)?searchNumber:0;
	}
	
	public static void main(String args[])
	{
		printDoubleEvenNumbers();
		printEvenNumbersUsingIterations();
		System.out.println();
		System.out.println(findNumber(10, storeEvenNumbers(100)));
	}
}
