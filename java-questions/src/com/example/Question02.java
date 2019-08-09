package com.example;

import java.util.Comparator;
import java.util.stream.Stream;

public class Question02 {

	public static void main(String[] args) {
		Comparator<Integer> comparator = Math::max;
		System.out.println(Stream.of(-3, -2, 1, 2, 3).max(comparator).get());

	}

}
