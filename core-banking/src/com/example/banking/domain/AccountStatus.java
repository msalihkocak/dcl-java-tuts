package com.example.banking.domain;

public enum AccountStatus {

	ACTIVE(100), PASSIVE(150);

	private int code;

	private AccountStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
