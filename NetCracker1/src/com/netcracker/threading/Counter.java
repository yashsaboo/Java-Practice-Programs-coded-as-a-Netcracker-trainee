package com.netcracker.threading;

public class Counter implements Runnable{
	
	@Override
	public void run()
	{
		
		for (int count = 0; count< 10;count++) {
			
			count++;
			System.out.println("Current value:"+count);
		}
		
		System.out.println("Threading ends");
	}

}
