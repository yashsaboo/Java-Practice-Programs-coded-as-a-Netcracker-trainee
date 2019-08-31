package com.netcracker.general;

public class ThreadExample {
	public static void main(String args[]) throws InterruptedException
	{
		String str = "Hello World";
		for(int i=0; i<str.length(); i++)
		{		
			System.out.print(str.charAt(i));
			Thread.sleep(1000);
		}
	}
}
