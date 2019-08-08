package com.example.banking.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void createCustomer() {
		Customer jack = new Customer("1", "Jack Bauer");

		assertEquals("Jack Bauer", jack.getFullName());
		assertEquals("1", jack.getIdentityNo());
		assertEquals(0, jack.getAccounts().size());
		assertTrue(jack.toString().contains("Customer"));
	}

	@Test
	public void manipulateCustomerAccounts() {
		Customer jack = new Customer("1", "Jack Bauer");

		jack.addAccount(new Account("TR1", 1_000));
		assertEquals(1, jack.getAccounts().size());
		jack.addAccount(new Account("TR2", 2_000));
		assertEquals(2, jack.getAccounts().size());
		jack.addAccount(new Account("TR3", 3_000));
		assertEquals(3, jack.getAccounts().size());

		assertTrue(jack.findAccount("TR1").isPresent());
		assertTrue(jack.findAccount("TR2").isPresent());
		assertTrue(jack.findAccount("TR3").isPresent());
		assertFalse(jack.findAccount("TR4").isPresent());

		assertTrue(jack.removeAccount("TR1").isPresent());
		assertEquals(2, jack.getAccounts().size());
		assertTrue(jack.removeAccount("TR2").isPresent());
		assertEquals(1, jack.getAccounts().size());
		assertTrue(jack.removeAccount("TR3").isPresent());
		assertEquals(0, jack.getAccounts().size());
	}

	@Test
	public void getTotalBalance() {
		Customer jack = new Customer("1", "Jack Bauer");

		jack.addAccount(new Account("TR1", 1_000));
		assertEquals(1, jack.getAccounts().size());
		jack.addAccount(new Account("TR2", 2_000));
		assertEquals(2, jack.getAccounts().size());
		jack.addAccount(new Account("TR3", 3_000));
		assertEquals(3, jack.getAccounts().size());

		assertEquals(6_000, jack.getTotalBalance(), 0.001);
	}

}
