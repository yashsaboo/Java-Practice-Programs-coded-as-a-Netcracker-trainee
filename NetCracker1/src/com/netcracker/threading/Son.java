package com.netcracker.threading;

public class Son implements Runnable {

	private Kitchen kitchen;
	
	volatile boolean stop;

	public void setKitchen(Kitchen kitchen) {
		this.kitchen = kitchen;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void run() {
		while (!stop) {
			System.out.println(Thread.currentThread().getName() + "eating..." + kitchen.consume());
		}
		System.out.println(Thread.currentThread().getName() + "stopped.");
	}

}
