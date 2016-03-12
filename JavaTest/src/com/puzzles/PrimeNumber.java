package com.puzzles;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		pm.testPrimeNumber(20);
	}

	public void testPrimeNumber(int number) {
		boolean prime = true;

		for (int j = 2; j <= number; j++) {
			
			int limit = j/2;
			for (int i = 2; i <= limit; i++) {
				if (j % i == 0) {
					prime = false;
					break;
				}
			}
			
			if (prime)
				System.out.println(j);
			else
				//System.out.println(j + " is not a prime number");
			prime = true;
		}
	}
}