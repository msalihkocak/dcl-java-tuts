package com.example.arrays;

import static com.example.arrays.A.getCounter;

import java.util.stream.IntStream;

public class StudyStatic {

	public static void main(String[] args) {
		A a = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		System.out.println(A.getCounter());
		System.out.println(a4.getCounterByObject());
		System.out.println(getCounter());
		
		IntStream.range(0, 1_000_000).forEach(i -> new A());
		System.out.println(A.getCounter());
		
	}
}

class A{
	private static int counter;
	
	public final static double PI = 3.141516;
	
	A(){
		counter += 1;
	}

	public static int getCounter() {
		return counter;
	}
	
	public int getCounterByObject() {
		return counter;
	}
}