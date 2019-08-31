package com.netcracker.threading;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		
		/*Showing the use of Thread when implementing Runnable*/
		Counter cnt = new Counter();
		Thread t1 = new Thread(cnt);
		t1.start();
		Thread t2 = new Thread(cnt);
		t2.start();
		System.out.println("End of Program");
		
		
		/* Showing the use of Thread when implementing Runnable	 */
		Counter2 cnt3 = new Counter2();
		cnt3.start();
		System.out.println("End of Program");
	}

}
