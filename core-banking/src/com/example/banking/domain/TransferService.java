package com.example.banking.domain;

public interface TransferService {
	int JAVA_CONST = 1;
	boolean transfer(Account from, Account to, double amount);
}
