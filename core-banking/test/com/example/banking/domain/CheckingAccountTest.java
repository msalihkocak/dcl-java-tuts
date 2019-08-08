package com.example.banking.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckingAccountTest {

	@Test
	public void withdraw_negativeAmount() {
		CheckingAccount acc = new CheckingAccount("TR1", 1_000, 500);
		assertEquals("TR1", acc.getIban());
		assertEquals(1000, acc.getBalance(), 0.0001);
		assertEquals(500, acc.getOverDraftAmount(), 0.0001);
		assertFalse(acc.withdraw(-1));		
		assertEquals(1000, acc.getBalance(), 0.0001);
	}
	
	@Test
	public void withdraw_allBalance() {
		CheckingAccount acc = new CheckingAccount("TR1", 1_000, 500);
		assertEquals("TR1", acc.getIban());
		assertEquals(1000, acc.getBalance(), 0.0001);
		assertEquals(500, acc.getOverDraftAmount(), 0.0001);
		assertTrue(acc.withdraw(1000));		
		assertEquals(0, acc.getBalance(), 0.0001);
	}

}
