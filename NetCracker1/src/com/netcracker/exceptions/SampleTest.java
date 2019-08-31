package com.netcracker.exceptions;

public class SampleTest {
	public static int divide(int num1, int  num2) throws ArithmeticException
	{
		return num1/num2;
	}
	public static void main(String args[]) throws Exception
	{
		try
		{
			divide(10,0);
			System.out.println("Hi");
		}
		catch(ArithmeticException e)
		{
			try
			{
				System.out.println("Hey");
				throw new Exception();
			}
			catch(Exception e2)
			{
				System.out.println("Hey2");
			}
		}
		finally
		{
			System.out.println("Bye");
		}
	}

}
