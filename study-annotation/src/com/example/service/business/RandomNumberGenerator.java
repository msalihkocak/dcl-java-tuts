package com.example.service.business;

import java.lang.reflect.Field;
import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;

import com.example.model.Random;

public class RandomNumberGenerator {
	public static void generate(Object o) {
		Class<?> clazz = o.getClass();
		for (Field field: clazz.getDeclaredFields()) {
			if (field.isAnnotationPresent(Random.class)) {
				Random random = field.getAnnotation(Random.class);
				int min = random.min();
				int max = random.max();
				int size = random.size();
				List<Integer> numbers = draw(min,max,size);
				try {
					field.setAccessible(true);
					field.set(o, numbers);
					field.setAccessible(false);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
	public static List<Integer> draw(int min, int max, int size) {
		return new SecureRandom().ints(min, max)
		          .distinct()
		          .limit(size)
		          .sorted()
		          .boxed()
		          .collect(Collectors.toList());
	}
}
