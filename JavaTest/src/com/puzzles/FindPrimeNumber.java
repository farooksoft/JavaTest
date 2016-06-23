package com.puzzles;

import java.util.Scanner;

/**
 * Program to find a number Prime or not * Logic: divide given number x from 2
 * to x/2. If divided the reminder is 0 then it's not a prime number otherwise
 * yes it is.
 * 
 * @author srayabar
 */
public class FindPrimeNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("enter a number \n");
		int a = s.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				isPrime = false;
				System.out.println("not prime");
				break;
			}
		}
		
		if (isPrime)
			System.out.println("prime");
	}
	
}