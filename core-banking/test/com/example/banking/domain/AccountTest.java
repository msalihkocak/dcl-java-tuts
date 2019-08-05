package com.example.banking.domain;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AccountTest {

	@Test
	public void createAccount() {
		Account acc = new Account("TR1", 1000);
		assertEquals(1000, acc.getBalance(), 0.001);
		assertEquals("TR1", acc.getIban());
		assertTrue(acc.toString().contains("Account"));
	
	}
	
	@Test
	public void deposit_withNegativeAmount() throws Exception {
		Account acc = new Account("TR1", 1_000);
		assertFalse(acc.deposit(-1));
		assertEquals(1_000, acc.getBalance(), 0.001);
	}

	@Test
	public void deposit_withNothing() throws Exception {
		Account acc = new Account("TR1", 1_000);
		assertFalse(acc.deposit(0));
		assertEquals(1_000, acc.getBalance(), 0.001);
	}

	@Test
	public void deposit_withPositiveAmount() throws Exception {
		Account acc = new Account("TR1", 1_000);
		assertTrue(acc.deposit(1));
		assertEquals(1_001, acc.getBalance(), 0.001);
	}

	@Test
	public void withdraw_withNegativeAmount() throws Exception {
		Account acc = new Account("TR1", 1_000);
		assertFalse(acc.withdraw(-1));
		assertEquals(1_000, acc.getBalance(), 0.001);
	}

	@Test
	public void withdraw_OverBalance() throws Exception {
		Account acc = new Account("TR1", 1_000);
		assertFalse(acc.withdraw(1001));
		assertEquals(1_000, acc.getBalance(), 0.001);
	}

	@Test
	public void withdraw_AllBalance() throws Exception {
		Account acc = new Account("TR1", 1_000);
		assertTrue(acc.withdraw(1_000));
		assertEquals(0, acc.getBalance(), 0.001);
	}

}
