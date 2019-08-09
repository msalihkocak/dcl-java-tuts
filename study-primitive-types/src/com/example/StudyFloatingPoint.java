package com.example;

import java.math.BigDecimal;

public class StudyFloatingPoint {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		float pi = 3.14151517f; // 4 - byte
		double pi2 = 3.1415151D; // 8 - byte

		double x = 2.0; // 8-byte

		x = x - 1.10;
		System.out.println(x == 0.9);
		System.out.println(String.format("x=%16.16f", x));

		BigDecimal bd = BigDecimal.valueOf(2.0);
		bd = bd.subtract(BigDecimal.valueOf(1.1));
		System.out.println(String.format("bd=" + bd));

		double one = 1.0 / 0.0;
		System.out.println("one=" + one);
		one++;
		System.out.println("one=" + one);
		
		one =  0.0 /0.0;
		System.out.println("one=" + one);
		System.out.println("isNaN=" + Double.isNaN(one));
		
		double inf = 1. / -0.;
		System.out.println("inf=" + inf);	

	}

}
