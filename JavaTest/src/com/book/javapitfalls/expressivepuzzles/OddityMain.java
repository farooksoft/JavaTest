package com.book.javapitfalls.expressivepuzzles;

public class OddityMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numberArray = {1,3 ,9, -1, -4, -3};
		
		for(int i : numberArray){
			System.out.println( i % 2 == 1);
		}

	}

}
