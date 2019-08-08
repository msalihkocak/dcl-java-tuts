package com.example.banking.app;

import com.example.banking.domain.AccountStatus;

public class StudyEnum {

	public static void main(String[] args) {
		AccountStatus[] accountStatuses = AccountStatus.values();

		for(AccountStatus status:accountStatuses) {
			System.out.println(status.name() + " : " + status.ordinal() 
			+ " : " + status.getCode());
		}
		
	}

}
