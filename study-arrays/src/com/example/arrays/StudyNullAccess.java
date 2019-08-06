package com.example.arrays;

import java.util.Optional;

public class StudyNullAccess {

	public static void main(String[] args) {
		
		Optional<B> b = Optional.empty();
		b.ifPresent(B::gun);
		b.ifPresent(x -> x.fun());
		b.ifPresent(x -> B.fun());
		((B)null).fun();
	}
}

class B{
	int x;
	static int y;
	
	public static void fun() {
		System.out.println("have fun...");
		y++;
		
		// These can not be done because we need an instance to access these
//		x++
//		gun();
	}
	
	public void gun() {
		System.out.println("have gun...");
		x++;
		// But these are possible
		y++;
		fun();
	}
}