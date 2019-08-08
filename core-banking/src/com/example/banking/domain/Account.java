package com.example.banking.domain;

import java.lang.*;

public class Account extends Object {
	private String iban;
	protected double balance;
	private AccountStatus status = AccountStatus.ACTIVE;

	private static long numOfAccounts;

	// shortcuts
	// Alt+Shift+S: show quick source menu
	// Alt+Up/Down: move code block up or down
	// Ctrl+Alt+Up/Down: clone block to up or down
	// Ctrl+Shift+f: format code
	// Ctrl+H: search menu
	// Ctrl+Alt+G: search text across workspace

	public Account(String iban, double balance) {
		this.iban = iban;
		this.balance = balance;
		numOfAccounts++;
	}

	public AccountStatus getStatus() {
		return status;
	}
	
	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	
	public String getIban() {
		return iban;
	}

	public double getBalance() {
		return balance;
	}
	
	public static long getNumOfAccounts() {
		return numOfAccounts;
	}

	@Override
	public String toString() {
		return "Account [iban=" + iban + ", balance=" + balance + "]";
	}

	public boolean withdraw(double amount) {
		System.out.println("Account::withdraw");
		// validation
		if(amount <= 0)
			return false;
		
		if(amount> balance)
			return false;
		
		this.balance -= amount;
		
		return true;
	}
	
	public boolean deposit(double amount) {
		// validation
		if (amount <= 0)
			return false;
		this.balance += amount;
		return true;
	}
	
	
}
