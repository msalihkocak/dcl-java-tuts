package com.example.banking.app;

import com.example.banking.domain.Account;
import com.example.banking.domain.Bank;
import com.example.banking.domain.Customer;
import com.example.banking.domain.TransferService;

public class StudyLooseCoupling {

	public static void main(String[] args) {
		
		Bank garanti = new Bank(1, "Garanti");

		Customer jack = garanti.createCustomer("1", "Jack Bauer");
		Account acc1 = new Account("TR1", 100_000);
		jack.addAccount(acc1);
		
		Customer kate = garanti.createCustomer("2", "Kate Austin");
		Account acc2 = new Account("TR2", 150_000);
		kate.addAccount(acc2);
		
		// garanti.transfer(acc1, acc2, 50_000);
		TransferService srv = garanti;
		srv.transfer(acc1, acc2, 50_000);
		
		System.out.println(acc1);
		System.out.println(acc2);		
	}

}
