package com.puzzles;

import java.util.Scanner;

/**
 * Program to check whether a number is Palimdrome or not
 * 
 * Def: A palindromic number is same when its digits are reversed. Like 16461.
 * 
 * @author srayabar
 */
public class PalindromeDemo {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("enter a number \n");
		int num = s.nextInt();

		//int n = 1233321;
		checkPalindrome(num);
	}

	private static void checkPalindrome(int n) {
		//n%10 - will give last number
		//n/10 - will give whole number without last number
		int result = 0;
		int temp = n;
		//System.out.println("input-"+n);
		while(n>0){
			int b = n%10;
			n = n/10;
			result = (result * 10) + b;
		}		
		//System.out.println("result-"+result);
		if(result == temp){
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}