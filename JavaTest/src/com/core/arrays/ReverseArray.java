package com.core.arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int a[] = { 9, 8, 7, 6 };
		System.out.println("Array elements are");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		System.out.println("Reverse order");
		for (int i = a.length - 1; i >= 0; i--)
			System.out.println(a[i]);
	}

}
