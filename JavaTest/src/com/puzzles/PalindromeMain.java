package com.puzzles;

/**
 * class to check if a given number is a palindrome or not
 * 
 * ex: 12221 89898 343343343 etc
 * 
 *  
 * Algo 1:

	Steps: Its a brute force method

	1. Have 2 for loops
	2. for i = 1 to i less than array.length -1
	3. for j=i+1 to j less than array.length
	4. This way you can get substring of every possible combination from the array
	5. Have a palindrome function which checks if a string is palindrome
	so for every substring (i,j) call this function, if it is a palindrome store it in a string variable
	If you find next palindrome substring and if it is greater than the current one, replace it with current one.
	Finally your string variable will have the answer
	
	Issues: 1. This algo runs in O(n^2) time.
 * 
 * 
 * 
 * @author srayabar
 *
 */
public class PalindromeMain {

	public static void main(String[] args) {
		isPalindromeOrNotInteger(12221);
		testStringPalindrome();
	}

	private static void testStringPalindrome() {
		
		String inputString = "ssdhsabccbakssdsd";
		
		
		
		
	}

	private static void isPalindromeOrNotInteger(int inputNumber) {
		
		System.out.println(inputNumber%10);
		
	}
	
	
	
	
}
