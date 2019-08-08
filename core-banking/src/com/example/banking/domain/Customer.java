package com.example.banking.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Customer {
	private String identityNo;
	private String fullName;
	private List<Account> accounts;
	
	public Customer(String identityNo, String fullName) {
		this.identityNo = identityNo;
		this.fullName = fullName;
		accounts = new ArrayList<>();
	}

	public String getIdentityNo() {
		return identityNo;
	}

	public String getFullName() {
		return fullName;
	}

	public List<Account> getAccounts() {
		return accounts;
	}
	
	public boolean addAccount(Account acc) {
		return accounts.add(acc); 
	}
	
	public Optional<Account> findAccount(String iban) {
		Optional<Account> result = accounts.stream().filter(acc -> {
			if(acc.getIban().equals(iban)) {
				return true;
			}
			return false;
		}).findFirst();
				
		return result;
	}
	
	public Optional<Account> removeAccount(String iban) {
		Optional<Account> acc = findAccount(iban);
		acc.ifPresent(accounts::remove);
		
		return acc;
	}
	
	public double getTotalBalance() {
		
		// JS 5
//		double total = 0;
//		for(Account acc: accounts) {
//			total += acc.getBalance();
//		}
//		
//		return total;
		
		// JS 8
		return accounts.stream().mapToDouble(Account::getBalance).sum();
	}

	@Override
	public String toString() {
		return "Customer [identityNo=" + identityNo + ", fullName=" + fullName + "]";
	}
}
