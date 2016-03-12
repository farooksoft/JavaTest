package com.puzzles;

public class NumberReverseDemo {
	
	public static void main(String[] args) {
		
		int a = 123456789;
		Integer aa = a;
		
		while(a%10 != 0){			
			System.out.println(a%10);
			a = a / 10;
		}
	}

}
