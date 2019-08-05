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
		this.accounts = new ArrayList<Account>();
	}
	
	public boolean addAccount(Account account) {
		return accounts.add(account);
	}
	
	public Optional<Account> findAccount(String iban){
		return accounts.stream().filter(acc -> {
			if(acc.getIban().equals(iban)){
				return true;
			}
			return false;
		}).findFirst();
	}
	
	public Optional<Account> removeAccount(String iban){
		Optional<Account> account = findAccount(iban);
		account.ifPresent(accounts::remove);
		return account;
	}

	@Override
	public String toString() {
		return "Customer [identityNo=" + identityNo + ", fullName=" + fullName + "]";
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
}
