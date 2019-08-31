package com.netcracker.exceptions;

public class Account {
	private double balance;
	
	public Account(double initialBalance) {
		balance = initialBalance;
	}
	
	public double withdraw(double amount) throws InsufficientBalanceException
	{
		if(amount > balance)
			throw new InsufficientBalanceException();
		balance -= amount;
		return balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public double deposit(double amount)
	{
		balance += amount;
		return balance;
	}


}
