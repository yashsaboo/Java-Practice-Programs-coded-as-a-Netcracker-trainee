package com.netcracker.threading;

import java.util.Random;

public class Mother implements Runnable {

	private Kitchen kitchen;
	private String[] itemNames = { "Roti", "Rice", "Soup" };

	public void setKitchen(Kitchen kitchen) {
		this.kitchen = kitchen;
	}

	public void run()
	{
		while(true)
		{
			Random random = new Random();
			String item = itemNames[random.nextInt(3)];
			kitchen.prepare(item);
			System.out.println("Preparing..."+item);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
