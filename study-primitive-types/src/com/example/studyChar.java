package com.example;

public class studyChar {

	public static void main(String[] args) {
		char x = 'A'; // 2-byte, unicode
		System.out.println("x=" + x);
		System.out.println((char)(x+1));

		System.out.println((int)x);
		System.out.println(x + 1);
		
		x = '\u20BA';
		System.out.println("x=" + x);

		System.out.println("H" + 'a'+ 'H' + 'a');
		System.out.println('a'+ 'H' + 'a' + "H");
		System.out.println('a'+ 'H' + 'a' + "H" + 'a'+ 'H' + 'a') ;
	}

}
