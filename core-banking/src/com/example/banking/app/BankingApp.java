package com.example.banking.app;

import java.util.function.Consumer;

import com.example.banking.domain.Account;
import com.example.banking.domain.Bank;
import com.example.banking.domain.Customer;

public class BankingApp {

	public static void main(String[] args) {
		
		Bank garanti = new Bank(1L, "garanti");
		
		Account acc1 = new Account("TR1", 100_000);
		Account acc2 = new Account("TR2", 200_000);
		Account acc3 = new Account("TR3", 300_000);

//		Customer jack = new Customer("1", "Jack Bauer");
		Customer jack = garanti.createCustomer("1", "JackBauer");
				
		jack.addAccount(acc1);
		jack.addAccount(acc2);
		jack.addAccount(acc3);
		
		Consumer<Account> printAccount = System.out::println;
		
		jack.findAccount("TR2").ifPresent(printAccount);
//		jack.findAccount("TR4").ifPresent(printAccount);
		
		jack.removeAccount("TR2").ifPresent(printAccount);
		jack.getAccounts().forEach(printAccount);
		
//		System.out.println(jack);
		
		Consumer<Customer> printCustomer = System.out::println;
		Consumer<Customer> printCustomerTotalBalance =
				customer -> System.out.println(customer.getTotalBalance());
		
		garanti.findCustomer("1").ifPresent(
				printCustomer.andThen(printCustomerTotalBalance
		));	
		
		Consumer<Bank> printBankTotalBalance = 
				bank -> System.out.println(bank.getTotalBalance()); 

		printBankTotalBalance.accept(garanti);
		
	}

}
