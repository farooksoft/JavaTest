package com.puzzles;

/**
 * class to check if a given number is a palindrome or not
 * 
 * ex: 12221 89898 343343343 etc
 * 
 * @author srayabar
 *
 */
public class PalindromeMain {

	public static void main(String[] args) {
		isPalindromeOrNot(12221);
	}

	private static void isPalindromeOrNot(int inputNumber) {
		
		System.out.println(inputNumber%10);
		
	}
	
}
