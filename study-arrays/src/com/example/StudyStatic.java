package com.example;

import static com.example.A.getCounter;

import java.util.stream.IntStream;

public class StudyStatic {

	public static void main(String[] args) {
		
		System.out.println(A.getCounter());
		
		System.out.println(getCounter());
		
		IntStream.range(0, 1_000_000).forEach(i -> new A());
		
		System.out.println(new A().getCounterByObject());

	}

}

class A {
	private static int counter;
	
	public final static double PI = 3.141516;
	
	A() {
		++counter;
	}
		
	public static int getCounter() {
		return counter;
	}
	
	public int getCounterByObject() {
		return counter;
	}
}
