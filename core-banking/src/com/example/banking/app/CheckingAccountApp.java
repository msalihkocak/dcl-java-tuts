package com.example.banking.app;

import com.example.banking.domain.CheckingAccount;

public class CheckingAccountApp {

	public static void main(String[] args) {
		
		CheckingAccount acc = new CheckingAccount("TR1", 10_000, 750);
		
		System.out.println(acc);
		
		acc.withdraw(10_500);

		System.out.println(acc);
		
		acc.withdraw(250);

		System.out.println(acc);

		acc.withdraw(50);
		
		System.out.println(acc);
	}

}
