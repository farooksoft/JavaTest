package com.puzzles;

public class PalindromeNumberDemo {
	
	public static void main(String[] args) {
		int n = 1233321;
		checkPalindrome(n);		
	}

	private static void checkPalindrome(int n) {		
		//n%10 - will give last number
		//n/10 - will give whole number without last number
		int result = 0;
		int temp = n;
		System.out.println("input-"+n);
		while(n>0){
			int b = n%10;
			n = n/10;
			result = (result * 10) + b;
		}		
		System.out.println("result-"+result);
		if(result == temp){
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}