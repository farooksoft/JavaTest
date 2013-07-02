package com.java.core.io;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "one");
		map.put("2", "Second");
		map.put("3", "Third");
		map.put("4", "Four");
		map.put("5", "Five");
		
		System.out.println("Before : "+map);
		
		Set<String> set = map.keySet();
		
		set.remove("1");
		
		System.out.println("After : "+map);
		
	}

}