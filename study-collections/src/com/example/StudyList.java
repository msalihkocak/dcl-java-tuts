package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudyList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		
		numbers.add(4);
		numbers.add(4);
		numbers.add(4);
		numbers.add(4);
		numbers.add(8);
		System.out.println(numbers);

		System.out.println(numbers.get(4));
		
		numbers.remove(0);
		numbers.remove(0);
		numbers.remove(0);
		System.out.println(numbers);
		
		List<Integer> lottery = new LinkedList<>();
		
		lottery.add(0, 15);
		lottery.add(0, 8);
		lottery.add(0, 16);
		lottery.add(0, 4);
		lottery.add(0, 42);
		lottery.add(0, 23);
		
		System.out.println(lottery);
				
		Collections.sort(lottery);
		System.out.println(lottery);
		
	}

}
