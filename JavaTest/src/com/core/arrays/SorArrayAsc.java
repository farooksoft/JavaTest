package com.core.arrays;

public class SorArrayAsc {
	public static void main(String args[]) {
		int arr1[] = { 11, 15, 8, 9, 3, 6, 10, 12, 5, 1, 2, 13, 4, 7, 14 };
		for (int i = 0; i < arr1.length; i++)
			System.out.println(arr1[i]);
		for (int i = 0; i < (arr1.length - 1); i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					int x, y;
					x = arr1[i];
					y = arr1[j];
					arr1[i] = y;
					arr1[j] = x;
				}
			}
		}
		System.out.println("Array after sorting in  ascending order");
		System.out.println();
		for (int i = 0; i < arr1.length; i++)
			System.out.println(arr1[i]);
	}
}
