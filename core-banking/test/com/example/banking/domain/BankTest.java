package com.example.banking.domain;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("unused")
public class BankTest {
	private static Bank bank;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		bank = new Bank(2, "asd");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void createBank() {
		System.out.println("createBank");
		
		Bank garanti = new Bank(1L, "Garanti BBVA");
		assertEquals(1L, garanti.getId());
		assertEquals("Garanti BBVA", garanti.getName());
	}
	@Test
	public void createBank2() {
		System.out.println("createBank2");
		
		Bank garanti = new Bank(1L, "Garanti BBVA");
		assertEquals(1L, garanti.getId());
		assertEquals("Garanti BBVA", garanti.getName());
	}

}
