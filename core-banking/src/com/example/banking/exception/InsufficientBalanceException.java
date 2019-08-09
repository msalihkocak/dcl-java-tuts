package com.example.banking.exception;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {

	private double deficit;

	public InsufficientBalanceException(String message, double deficit) {
		super(message);
		this.deficit = deficit;
	}

	public double getDeficit() {
		return deficit;
	}

}
