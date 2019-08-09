package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Question01 {
	public static void main(String[] args) {
//		new Random().ints(1,50).distinct()
//		           .limit(6)
//		           .sorted()
//		           .forEach(System.out::println);
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(8);
		list.add(15);
		list = list.subList(0, 2);
		Stream<Integer> stream = list.stream();
		list.add(23);
		stream.forEach(System.out::println);
	}
}
