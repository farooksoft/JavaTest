package com.core.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		//decide size depends on the logic
		Map<String, String> map = new HashMap<String, String>(0);

		map.put("1", "one");
		map.put("2", "Second");
		map.put("3", "Third");
		map.put("4", "Four");
		map.put("5", "Five");

		System.out.println("Before : " + map);

		Set<String> set = map.keySet();

		set.remove("1");

		System.out.println("After : " + map);

	}

}
