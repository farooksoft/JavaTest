package com.json.examples;

import java.util.HashMap;
import java.util.Map;

import com.core.utilities.JSONUtility;

public class JSONConversions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JSONConversions conversions = new JSONConversions();
		System.out.println("JSON from Map : "+JSONUtility.jsonFromMap(conversions.getRandomDataMap()));		
		System.out.println("Map from JSON : "+JSONUtility.mapFromJson(conversions.getRandomDataJSON()));
	}
	
	/**
	 * Method to get a Map which uses for creating JSON out of it
	 * @return Map
	 */
	private Map<String, Object> getRandomDataMap(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		
		return map;
	}
	
	/**
	 * Mehtod to get a JSON String for creating Map out of it
	 * @return
	 */
	private String getRandomDataJSON(){
		String json = "{\"one\":\"1\"},{\"two\":\"2\"}";
		
		return json;
	}

}
