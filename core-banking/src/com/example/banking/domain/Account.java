package com.example.banking.domain;

import com.example.banking.exception.InsufficientBalanceException;

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

	public void withdraw(double amount) throws InsufficientBalanceException {
		System.out.println("Account::withdraw");
		// validation
		if (amount <= 0)
			throw new IllegalArgumentException("Amount must be positive");
		// business rule
		if (amount > balance)
			throw new InsufficientBalanceException("Insufficient Fund", amount - balance);

		this.balance -= amount;
	}

	public void deposit(double amount) {
		// validation
		if (amount <= 0)
			throw new IllegalArgumentException("Amount must be positive");
		this.balance += amount;
	}

}
