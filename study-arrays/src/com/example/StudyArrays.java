package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class StudyArrays {

	private static final class SortIntegerDesc implements Comparator<Integer> {
		@Override
		public int compare(Integer a, Integer b) {
			return a - b;
		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[] arr;
		arr = new int[6];

		arr[0] = 4;
		arr[1] = 8;
		arr[2] = 16;
		arr[3] = 15;
		arr[4] = 42;
		arr[5] = 23;

		int[] arr2;
		arr2 = new int[] { 4, 8, 16, 15, 42, 23 };

		int[] arr3 = { 4, 8, 16, 15, 42, 23 };

		Integer[] numbers = { 4, 8, 16, 15, 42, 23 };

		int z = 0;
		while (z < arr.length) {
			System.out.println(arr[z]);
			z++;
		}

		System.out.println();

		for (int i = 0; i < arr.length; ++i)
			System.out.println(arr[i]);

		System.out.println();

		for (int v : arr) {
			System.out.println(v);
			v++;
		}

		System.out.println();

		for (int v : arr) {
			System.out.println(v);
		}

		for (int i = 0; i < arr.length; i += 3)
			System.out.println(arr[i]);

		int prod = 1;
		for (int x : arr) {
			prod *= x;
		}

		System.out.println(prod);

		// STREAM API
		// FilterMapReduce
		// Lambda Expression
		prod = Arrays.stream(arr).reduce(1, (s, x) -> s * x);
		System.out.println(prod);

		Arrays.sort(numbers, new SortIntegerDesc());
		
		Arrays.sort(numbers, (a, b) -> { 
			return b-a;
			}
		);
		
		for(int v : numbers)
			System.out.println(v);
		
		String names[];
		names = new String[100];
		List<String> isimler = new ArrayList<>();
		
		new Random().ints(1,50).distinct().limit(6).sorted().forEach(System.out::println);
		
	}

}
