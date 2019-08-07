package com.example.collections;

import java.util.Set;
import java.util.TreeSet;

public class StudySet {

	public static void main(String[] args) {
		
		Set<Integer> numbers = new TreeSet<Integer>();
		
		numbers.add(42);
		numbers.add(8);
		numbers.add(23);
		numbers.add(16);
		numbers.add(4);
		numbers.add(15);
		
		System.out.println(numbers);
		System.out.println(numbers.contains(16));
		System.out.println(numbers.contains(17));
	}

}
