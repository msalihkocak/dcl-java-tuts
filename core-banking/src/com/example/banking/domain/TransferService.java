package com.example.banking.domain;

import java.io.IOException;

import com.example.banking.exception.InsufficientBalanceException;

public interface TransferService {
	int JAVA_CONST = 1;
	void transfer(Account from, Account to, double amount) throws InsufficientBalanceException, IOException;
}
