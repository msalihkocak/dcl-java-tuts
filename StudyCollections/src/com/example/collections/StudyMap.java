package com.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class StudyMap {

	public static void main(String[] args) {

		Map<String, Integer> areaCodes = new HashMap<String, Integer>();
		areaCodes.put("İstanbul-Avrupa", 212);
		areaCodes.put("İstanbul-Anadolu", 216);
		areaCodes.put("Ankara", 312);
		
		System.out.println(areaCodes.get("İstanbul-Anadolu"));
		
		System.out.println("Cities: ");
		
		for(String city: areaCodes.keySet()) 
			System.out.println(city);
		
		System.out.println("Area Codes: ");
		
		for(Integer code: areaCodes.values())
			System.out.println(code);
		
		System.out.println("City <==> AreaCodes: ");
		for(Entry<String, Integer> entry: areaCodes.entrySet()) 
			System.out.println(entry.getKey() + " : " + entry.getValue());
	}

}
