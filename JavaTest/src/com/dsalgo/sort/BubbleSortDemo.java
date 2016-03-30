package com.dsalgo.sort;

import java.util.Arrays;

/**
 * logic:
 * 1. iterate from array end - i
 * 2. iterate from array start with first loop i value - j
 * 3. compare  j and j+1 and swap
 * 
 * complexities:
 * best - O(n) - bad - even if given array is already sorted program will scan all the elements once
 * average - O(n^2) - worst - else n * n times the array is scanned for swaps
 * 
 * @author srayabar
 */
public class BubbleSortDemo {
	
	public static void main(String[] args) {
		
		Integer[] inputArray = {12, 2, 45, 0, 5, 18, 75, 1};
		
		System.out.println("Before Sort : "+Arrays.toString(inputArray));
		doBubbleSort(inputArray);
		System.out.println("After Sort : " + Arrays.toString(inputArray));
	}

	private static void doBubbleSort(Integer[] inputArray) {
		
		for(int i=inputArray.length-1; i>=0; i--){
			
			for(int j=0; j<i;j++){
				
				//swap the values if they are not sorted
				if(inputArray[j] > inputArray[j+1]){
					int d = inputArray[j+1];
					inputArray[j+1] = inputArray[j];
					inputArray[j] = d;
				}
			}
		}
	}
}