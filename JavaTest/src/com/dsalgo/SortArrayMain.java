package com.dsalgo;

/**
 * class to sort an array of integers - each element of array will compare with all other elements and swaps its positions
 * 
 * it also finds max value
 * 
 * @author srayabar
 *
 */
public class SortArrayMain {
	
	public static void main(String[] args) {
		
		int a[] = { 3, 0, 56, 8, 5, 4 };
		
		int s = a.length;

		for (int i = 0; i < s; i++) {
			
			for (int j = i + 1; j < s; j++) {
				
				if (a[i] > a[j]) {// > for ascending, < for descending
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		
		for (int i = 0; i < s; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		//finding max value
		int max = 0;
		for(int i=0; i<a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		
		System.out.println("max value is : " + max);
	}

}
