package com.core.strings;

import java.util.Arrays;

/**
 * class to sort the characters of a random string
 * 
 * @author srayabar
 *
 */
public class StringCharsSortDemo {

	public static void main(String[] args) {
		
		//random string
		String abc = "suaxang";		
		char[] charArray = abc.toCharArray();
		Arrays.sort(charArray);		
		abc = new String(charArray);
		
		//sorted string array
		System.out.println(abc);
	}
}