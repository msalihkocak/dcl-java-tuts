package com.example.banking.app;

import java.util.Random;

import com.example.banking.domain.Account;
import com.example.banking.domain.CheckingAccount;

public class StudyPolymorphism {

	public static void main(String[] args) {
		
		Account acc;
		
		if(new Random().nextBoolean())
			acc = new Account("TR1", 1_000);
		else
			acc = new CheckingAccount("TR2", 1000, 500);
		
		System.out.println(acc.getBalance());
		
//		acc.getOverDraftAmount();
		
		acc.withdraw(1500);
		
		System.out.println(acc.getBalance());

	}

}
