package com.ecommerce.webapp;

public class BankApp {
	
	double balance = 2000;
	
	public double showBalance() {
		return balance;
	}
	
	public double depositAmount(double amount) {
		if(amount < 0) {
			return -1;
		}
		this.balance += amount;
		return  this.balance;
	}
	
	// withdraw
}
