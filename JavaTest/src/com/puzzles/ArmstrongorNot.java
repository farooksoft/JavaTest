package com.puzzles;

public class ArmstrongorNot {

	public static void main(String args[]) {

		int num = Integer.parseInt(args[0]);
		int n = num; // use to check at last time
		int check = 0, remainder;

		while (num > 0) {
			remainder = num % 10;
			System.out.println("remainder : " + remainder);
			check = check + (int) Math.pow(remainder, 3);
			System.out.println("Check : " + check);
			num = num / 10;
			System.out.println("num : " + num);
		}

		if (check == n)
			System.out.println(n + " is an Armstrong Number");
		else
			System.out.println(n + " is not a Armstrong Number");
	}
}
