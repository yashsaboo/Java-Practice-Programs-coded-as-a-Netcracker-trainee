package com.netcracker.threading;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedVariable extends Thread{

	private static AtomicInteger counter = new AtomicInteger();
	int x = 0;
	
	public void run()
	{
		while(true)
		{
			int value = counter.incrementAndGet();
			x++;
			System.out.println("Current value:"+value);
			System.out.println("Current value of x:"+x);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
