package com.netcracker.threading;

public class Lunch {

	public static void main(String[] args) throws InterruptedException {
		Kitchen kt = new Kitchen();
		Mother mother = new Mother();
		Son son = new Son();
		
		mother.setKitchen(kt);
		son.setKitchen(kt);
		Thread t1 = new Thread(mother);
		Thread t2 = new Thread(son, "Son 1");
		Thread t3 = new Thread(son, "Son 2");
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(1000);
		son.setStop(true);
		
	}

}
