package com.example.banking.domain;

import com.example.banking.exception.InsufficientBalanceException;

public class CheckingAccount extends Account {
	private double overDraftAmount;


	public CheckingAccount(String iban, double balance, double overDraftAmount) {
		super(iban, balance);
		this.overDraftAmount = overDraftAmount;
	}
	
	public double getOverDraftAmount() {
		return overDraftAmount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientBalanceException {
		System.out.println("CheckingAccount::withdraw");
		if(amount <= 0)
			throw new IllegalArgumentException("Amount must be positive");
		
		if(amount > (balance +overDraftAmount))
			throw new InsufficientBalanceException("Insufficient Fund", amount - balance - overDraftAmount);
		
		balance -= amount;
		
	}
	
	
}
