package com.puzzles;

import java.util.Scanner;

/**
 * Program to check given number is Armstrong or not
 * 
 * Def: Armstrong number is a number that is equal to the sum of cubes of its digits.
 * For example 0, 1, 153, 370, 371, 407 etc.
 * 
 * @author srayabar
 */
public class ArmstrongDemo {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.print("enter a number \n");
		int num = s.nextInt();
		
		int n = num; // use to check at last time
		int check = 0, remainder;

		while (num > 0) {			
			remainder = num % 10;
			
			//System.out.println("remainder : " + remainder);
			check = check + (remainder * remainder * remainder);
			
			//System.out.println("Check : " + check);
			
			num = num / 10;
			//System.out.println("num : " + num);
		}

		if (check == n)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}
}
