package com.netcracker.exceptions;

public class Bank {
	public static void  main(String args[])
	{
		Account account = new Account(5000);
		try {
			account.withdraw(6000);
		} catch (InsufficientBalanceException e) {
			System.out.println("Insuffiecient Amount");
			e.printStackTrace();
		}
	}

}
