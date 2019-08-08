package com.example.banking.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public final class Bank implements TransferService{
	
	private final long id;
	private final String name;
	private final List<Customer> customers;
	
	public Bank(final long id, final String name) {
		this.id = id;
		this.name = name;
		customers = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Customer> getCustomers() {
		return customers;
	}
	
	public final Customer addCustomer(Customer customer) {
		customers.add(customer);
		return customer;
	}
	
	public Customer createCustomer(String identityNo, String fullName) {
		Customer customer = new Customer(identityNo, fullName);
		customers.add(customer);
		return customer;
	}
	
	public Optional<Customer> findCustomer(String identityNo) {
		for(Customer customer:customers)
			if(customer.getIdentityNo().equals(identityNo))
				return Optional.of(customer);
		
		return Optional.empty();
	}
	
	public Optional<Customer> findCustomer8(String identityNo) {
		return customers.stream().filter(customer -> 
			customer.getIdentityNo().equals(identityNo)
		).findFirst();
	}
	
	public double getTotalBalance() {
		return customers.stream().mapToDouble(Customer::getTotalBalance).sum();
	}
	
	public double getTotalBalance2() {
		return customers.stream().map(Customer::getAccounts)
				.flatMap(Collection::stream)
				.mapToDouble(Account::getBalance).sum();
	}

	@Override
	public boolean transfer(Account from, Account to, double amount) {
		if(amount <= 0)
			return false;
		
		if(from.withdraw(amount)) {
			return to.deposit(amount);
		}
		return false;
	}

	

}
