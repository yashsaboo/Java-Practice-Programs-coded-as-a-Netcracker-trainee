package com.netcracker.threading;

public class MainThreadApp {

	public MainThreadApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		String message = "Hello from Java";
		
		for (char ch: message.toCharArray()) {
			System.out.println(ch);
			Thread.sleep(250);
		}

	}

}
