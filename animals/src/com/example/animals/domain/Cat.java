package com.example.animals.domain;

public class Cat extends Animal implements Pet{
	
	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	
	public Cat() {
		this("Tekir");
	}

	@Override
	public void eat() {
		System.out.println(name + " is eating now.");
	}
	
	@Override
	public void play() {
		System.out.println(name + " is playing now.");
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
