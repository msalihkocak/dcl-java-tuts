package com.example.animals.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cat extends Animal implements Pet, Serializable {
	
	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	
	public Cat() {
		this("Tekir");
	}

	@Override
	public void play() {
		System.out.println(name + " is playing now");
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void eat() {
		System.out.println(name + " is eating now");
	}
}
