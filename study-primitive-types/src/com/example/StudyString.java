package com.example;

public class StudyString {

	public static void main(String[] args) {
		//
		// String : immutable
		String name1 = "Jack";
		System.out.println("Hello " + name1.toUpperCase());
		System.out.println("Hello " + name1);

		System.out.println("2+2=" + 2 + 2);

		System.out.println("2+2=" + (2 + 2));

		String name2 = new String("Jack");
		String name3 = "Jack";

		System.out.println("name3:" + name3);
		System.out.println("name1==name2:" + (name1 == name2));
		System.out.println("name1==name3:" + (name1 == name3));

		name2 = name2.intern();

		System.out.println("name1==name2:" + (name1 == name2));

		System.out.println("name1.equals(name2):" + (name1.equals(name2)));

		String surname;

		switch (name1) {
		case "Jack":
			surname = "Bauer";
			break;
		case "Kate":
			surname = "Austin";
			break;
		default:
			surname = "Lost";
		}
		
		System.out.println(surname);

	}

}
