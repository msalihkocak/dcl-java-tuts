package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudyMap {

	public static void main(String[] args) {
		Map<String, Integer> areaCodes = new HashMap<>();
		
		areaCodes.put("istanbul-avrupa", 212);
		areaCodes.put("istanbul-anadolu", 216);
		areaCodes.put("ankara", 312);
		
		
		System.out.println(areaCodes.get("ankara"));
		
		System.out.println("Cities: ");
		
		for(String city: areaCodes.keySet()) {
			System.out.println(city);
		}

		System.out.println("Area codes: ");
		
		for(int areaCode: areaCodes.values()) {
			System.out.println(areaCode);
		}
		
		System.out.println("City <==> AreaCodes:");
		
		for(Entry<String, Integer> entry: areaCodes.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		

	}

}
