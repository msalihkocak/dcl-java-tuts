package com.example.banking.app;

import java.util.function.Consumer;

import com.example.banking.domain.Account;
import com.example.banking.domain.Customer;

public class BankingApp {

	public static void main(String[] args) {
		
		Account acc1 = new Account("TR1", 100_000);
		Account acc2 = new Account("TR2", 100_000);
		Account acc3 = new Account("TR3", 100_000);

		Customer jack = new Customer("1", "Jack Bauer");
		Customer michael = new Customer("2", "Michael Scofield");
		
		jack.addAccount(acc1);
		jack.addAccount(acc2);
		michael.addAccount(acc3);
		
		Consumer<Account> printAccount = System.out::println;
//		jack.findAccount("TR3").ifPresent(printAccount);
		
		jack.removeAccount("TR2").ifPresent(printAccount);
		jack.getAccounts().forEach(printAccount);
//		michael.getAccounts().forEach(printAccount);
		
		System.out.println(jack);
		System.out.println(michael);
	}

}
