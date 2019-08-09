package com.example.banking.domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.banking.exception.InsufficientBalanceException;

public final class Bank implements TransferService {

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
		for (Customer customer : customers)
			if (customer.getIdentityNo().equals(identityNo))
				return Optional.of(customer);

		return Optional.empty();
	}

	public Optional<Customer> findCustomer8(String identityNo) {
		return customers.stream().filter(customer -> customer.getIdentityNo().equals(identityNo)).findFirst();
	}

	public double getTotalBalance() {
		return customers.stream().mapToDouble(Customer::getTotalBalance).sum();
	}

	public double getTotalBalance2() {
		return customers.stream().map(Customer::getAccounts).flatMap(Collection::stream)
				.mapToDouble(Account::getBalance).sum();
	}

	@Override
	public void transfer(Account from, Account to, double amount) throws InsufficientBalanceException , IOException {
		// try-with-resources
		try(
				PreciousResource res1 = new PreciousResource(1);
				PreciousResource res2 = new PreciousResource(2);
				PreciousResource res3 = new PreciousResource(3);
				) {
//			from.withdraw(amount);
//			to.deposit(amount);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			throw e; // re-throw
		} 
		
	}
	
	@SuppressWarnings("finally")
	static int fun() {
		try {
			System.exit(0);
			return 42;
		} finally {
			return 108;
		}
	}
public static void main(String[] args) {
	System.out.println(fun());
	Bank bank= new Bank(1, "FED");
	try {
		bank.transfer(null, null, -1);
	} catch (InsufficientBalanceException| IOException e) {
		Arrays.stream(e.getSuppressed())
		      .map(Throwable::getMessage)
		      .forEach(System.out::println);
	}
}
}
