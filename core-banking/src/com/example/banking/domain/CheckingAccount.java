package com.example.banking.domain;

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
	public boolean withdraw(double amount) {
		System.out.println("CheckingAccount::withdraw");
		if(amount <= 0)
			return false;
		
		if(amount > (balance +overDraftAmount))
			return false;
		
		balance -= amount;
		
		return true;		
	}
	
	
}
