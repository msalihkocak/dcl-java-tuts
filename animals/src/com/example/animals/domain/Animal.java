package com.example.animals.domain;

public abstract class Animal {
	
	protected int legs;

	public Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("Animal with " + legs + " legs is walking now.");
	}
	
	public abstract void eat();

	public int getLegs() {
		return legs;
	}	
}
