package com.puzzles;

import java.util.HashMap;
import java.util.Map;

/**
 * program which caches fibinocci values - improves performance
 * 
 * @author srayabar
 *
 */
public class FibinocciSeriesMemoization {

	static Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		
		int input = 10;
		
		Integer integer = cache.get(input);
		if(integer != null){
			System.out.println(integer);
		} else{
			int calculateCachedFibinocciNumber = calculateCachedFibinocciNumber(input);
			System.out.println(calculateCachedFibinocciNumber);
			cache.put(input, calculateCachedFibinocciNumber);
		}
	}

	private static int calculateCachedFibinocciNumber(int num) {
		
		if(num == 1 || num == 2){
			return 1;
		}		
		return calculateCachedFibinocciNumber(num-1) + calculateCachedFibinocciNumber(num-2);
	}
}