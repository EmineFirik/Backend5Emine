package com.neotech.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {
		
		Map<String,String>map = new LinkedHashMap<>();
		
		map.put("firstName", "Yildirim");
		map.put("lastName", "Likos");
		map.put("age"," 25");
		
		System.out.println(map);
		
		String name = map.get("firstName");
		
		System.out.println(name);
		
		String lastName = map.get("lastName");
		System.out.println(lastName);
		
		
	}
}
