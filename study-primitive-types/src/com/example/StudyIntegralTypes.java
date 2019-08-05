package com.example;

import java.math.BigInteger;

public class StudyIntegralTypes {

	public static void main(String[] args) {
		byte b = 1; // 1-byte [-128.. 127]
		b = 127;
		b++;
		System.out.println("b=" + b);
		b--;
		System.out.println("b=" + b);

		short s = 1; // 2-Byte, [-32768..32767]
		s = Short.MAX_VALUE;
		System.out.println("s=" + s);
		s++;
		System.out.println("s=" + s);

		long l = 1; // 8-byte
		l = Long.MAX_VALUE;
		System.out.println("l=" + l);
		l++;
		System.out.println("l=" + l);

		BigInteger bi = BigInteger.valueOf(Long.MAX_VALUE);
		System.out.println("bi=" + bi);
		bi = bi.add(BigInteger.ONE);
		System.out.println("bi=" + bi);

		byte x = 127, y = 1, z = 0;
		z += x + y;
		System.out.println("z=" +  z);
		z = (byte) (z+x+y);
		System.out.println("z=" +  z);
		
		z++;
		z = (byte)(z+1);
		System.out.println("z=" +  z);
		
		long m = 12345 + 54321L;
		System.out.println("m=" +  m);
		
		int one = 1 / 0;
		System.out.println("one=" +  one);
		

	}

}
