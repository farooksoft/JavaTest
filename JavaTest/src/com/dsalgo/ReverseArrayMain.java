package com.dsalgo;

public class ReverseArrayMain {
	
	public static void main(String[] args) {
		
		int a[] = { 9, 8, 7, 6 , 14};
		System.out.println("Array elements are");
		
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		System.out.println("Reverse order");
		
		//for (int i = a.length - 1; i >= 0; i--)
			//System.out.println(a[i]);
		
		//reversing array
		for (int i = 0; i < a.length/2; i++) {
			int j = a[i];
			int k = a[a.length-(i+1)];
			a[a.length-(i+1)] = j;
			a[i] = k;			
		}
		
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			System.out.println(j);
		}
	}

}
