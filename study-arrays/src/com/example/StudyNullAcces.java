package com.example;

import java.util.Optional;

public class StudyNullAcces {

	public static void main(String[] args) {
		Optional<B> b = Optional.empty();

		b.ifPresent(B::gun);
		
		b.ifPresent(x -> B.fun());
		
		((B)null).fun();
	}

}

class B {
	int x;
	static int y;
	
	public static void fun() {
		System.out.println("have fun...");
		y++;
		
//		gun();
//		x++;
	}
	
	public void gun() {
		System.out.println("have gun...");
		
		y++;
		x++;
	}
}