package com.example.animals.app;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.animals.domain.Animal;
import com.example.animals.domain.Cat;
import com.example.animals.domain.Fish;
import com.example.animals.domain.Pet;
import com.example.animals.domain.Spider;

public class AnimalsApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Animal> animals = Arrays.asList(
				new Spider(), 
				new Cat("Garfield"),
				new Spider(),
				new Fish("Jaws"),
				new Cat(),
				new Fish("Free Willy"));
		
		// Java SE 5
		for(Animal animal: animals) {
			animal.walk();
			animal.eat();
			
			if(animal instanceof Pet) {
				((Pet)animal).play();
			}
		}
		
		System.out.println();
		
		// Java SE 8
		Consumer<Animal> walk = Animal::walk;
		Consumer<Animal> eat = Animal::eat;
		
		Consumer<Animal> playIfPet = animal -> {
			if(animal instanceof Pet)
				((Pet)animal).play();
		};
		
		animals.forEach(walk.andThen(eat).andThen(playIfPet));

		// calculate total legs
		int legs = animals.stream().mapToInt(Animal::getLegs).sum();
		System.out.println("legs=" + legs);
		
		Predicate<? super Animal> isPet = animal -> {
			return animal instanceof Pet;
		};
		
		long numOfPets = animals.stream().filter(isPet).count();
		
		long numOfPets2 = animals.stream()
				.filter(animal -> animal instanceof Pet).count();
		long numOfPets3 = animals.stream()
				.filter(animal -> {
					/// multi line expression...
					return animal instanceof Pet;
				}).count();
				
		
		System.out.println("numOfPets=" + numOfPets);
		
		long numOfWild = animals.stream().filter(isPet.negate()).count();
		System.out.println("numOfWild=" + numOfWild);
		
		Class<Pet> clazz = Pet.class;
		
		Consumer<Animal> playIfPet2 = animal -> {
			if(clazz.isInstance(animal)) {
				clazz.cast(animal).play();
			}
		};
		
		List<Animal> pets = animals.stream().
				filter(isPet).collect(Collectors.toList());
		
		pets.forEach(System.out::println);
		
		animals.stream()
			.map(Animal::getLegs)
			.max(Integer::compare)
			.ifPresent(System.out::println);
		
	}

}
