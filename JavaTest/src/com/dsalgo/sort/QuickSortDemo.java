package com.dsalgo.sort;

import java.util.Arrays;

/**
 * If the array contains only one element or zero elements then the array is sorted. If the array contains more then one element then:
	Select an element as a pivot element, generally from middle but not necessary.
	
	Data elements are grouped into two parts: 
	one with elements that are in lower order than the pivot element, one with element that are in higher order than the pivot element.
	Sort the both parts separately by repeating step 1 and 2.
	
	With Single Pivot
 * 
 * @author srayabar
 */
public class QuickSortDemo {
	
	public static void main(String[] args) {
		
		Integer[] inputArray = new Integer[]{12, 2, 45, 0, 5, 18, 75, 1};
		
		System.out.println("Before Sort : "+Arrays.toString(inputArray));
		
		doQuickSort(inputArray, 0, inputArray.length-1);
		
		System.out.println("After Sort : " + Arrays.toString(inputArray));		
	}

	/**
	 * this would be recursive function
	 * 
	 * @param inputArray
	 */
	private static void doQuickSort(Integer[] inputArray, int low, int high) {
		
		if(inputArray == null || inputArray.length == 0){
			return;
		}		
		if(low >= high){
			return;
		}
		
		int middle = low + (high - low)/2;		
		System.out.println("Middle : " + middle); 
		int pivot = inputArray[middle];
		System.out.println("Pivot : " + pivot);
		
		int i = low, j = high;
		
		while(i<=j){
			while(inputArray[i] < pivot){
				i++;
			}
			while(inputArray[j] > pivot){
				j--;
			}
			if(i<=j){
				swap(inputArray, i, j);
				i++;
				j--;
			}
		}//while end
		System.out.println("low : " + low + ", high : " + high + ", i : " + i + ", j : " + j);
		if(low < j){
			doQuickSort(inputArray, low, j);
		}
		if(high > i){
			doQuickSort(inputArray, i, high);
		}
	}

	private static void swap(Integer[] inputArray, int i, int j) {
		int temp = inputArray[i];
		System.out.println("first to swap : " + temp);
		System.out.println("second to swap : " + inputArray[j]);
		inputArray[i] = inputArray[j];
		inputArray[j] = temp;
	}
}