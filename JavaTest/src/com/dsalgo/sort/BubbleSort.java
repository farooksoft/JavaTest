package com.dsalgo.sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		Integer[] inputArray = new Integer[]{12, 2, 45, 0, 5, 18, 75, 1};
		
		System.out.println("Before Sort : "+Arrays.toString(inputArray));
		
		doBubbleSort(inputArray);
		
		System.out.println("After Sort : " + Arrays.toString(inputArray));
		
	}

	private static void doBubbleSort(Integer[] inputArray) {
		
		for(int i=inputArray.length-1; i>0; i--){
			
			for(int j=0; j<i;j++){
				
				if(inputArray[j] > inputArray[j+1]){
					int d = inputArray[j+1];
					inputArray[j+1] = inputArray[j];
					inputArray[j] = d;					
				}
			}
		}
		
	}
}