package com.netcracker.threading;

import java.util.Stack;

public class Kitchen {

	Stack<String> items = new Stack<>();

	public synchronized void prepare(String itemName) {
		items.push(itemName);
		if (items.size() == 1)
			notify();
		else
			notifyAll();
	}

	public synchronized String consume() {
		if (items.isEmpty()) {
			try {
				wait();
				System.out.println("Waiting...");
			} catch (Exception e) {

			}
		}
		return items.pop();
	}

}
