package com.dsalgo.arrays;

public class LocationArray {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int a[] = { 0, 1, 2, 3, 4, 50, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				System.out.println("Element found at location" + (i + 1));
				break;
			}
		}
	}
}