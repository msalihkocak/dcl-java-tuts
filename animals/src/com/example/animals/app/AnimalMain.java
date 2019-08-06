package com.example.animals.app;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.animals.domain.Animal;
import com.example.animals.domain.Cat;
import com.example.animals.domain.Fish;
import com.example.animals.domain.Pet;
import com.example.animals.domain.Spider;

public class AnimalMain {
	public static void main(String[] args) {
		
		List<Animal> animals = Arrays.asList(
				new Spider(), 
				new Cat("Garfield"),
				new Spider(),
				new Fish("Jaws"),
				new Cat(),
				new Fish("Free Willy"));
		for(Animal animal : animals) {
			animal.walk();
			animal.eat();
			if(animal instanceof Pet)
				((Pet)animal).play();
		}
		
		System.out.println();
		
		Consumer<Animal> walk = Animal::walk;
		Consumer<Animal> eat = Animal::eat;
		
		Consumer<Animal> playIfPet = animal -> {
			if(animal instanceof Pet)
				((Pet)animal).play();
		};
		
		animals.forEach(walk.andThen(eat).andThen(playIfPet));
		
		int legs = animals.stream().mapToInt(Animal::getLegs).sum();
		System.out.println("Total leg count is " + legs);
		
		Predicate<Animal> isPet = animal -> {
			return animal instanceof Pet;
		};
		
		long numOfPets = animals.stream().filter(isPet).count();
		System.out.println("Num of pets = " + numOfPets);
		
		long numOfWild = animals.stream().filter(isPet.negate()).count();
		System.out.println("Num of wild animals = " + numOfWild);
		
		Class<Pet> clazz = Pet.class;
		
		Consumer<Animal> playIfPet2 = animal -> {
			if(clazz.isInstance(animals))
				clazz.cast(animal).play();
		};
		
		List<Animal> pets = animals.stream().filter(isPet).collect(Collectors.toList());
		pets.forEach(System.out::println);
		
		System.out.println("Get maximum legged animal's leg count:");
		animals.stream().map(Animal::getLegs).max(Integer::compare).ifPresent(System.out::println);
		
		
	}
}
