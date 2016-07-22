package com.dsalgo.sort;

/**
 * 
 * 
 * @author srayabar
 */
public class MergeSortDemoVogella {
	
	private int[] numbers;
	private int[] helper;	
	private int number;
	
	public void sort(int[] values) {
		this.numbers = values;
		this.number = values.length;
		this.helper = new int[this.number];
		mergeSort(0, this.number-1);
	}

	private void mergeSort(int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		if(low < high){
			// Get the index of the element which is in the middle
			int middle = low + (high - low)/2;
			// Sort the left side of the array
			mergeSort(low, middle);
			// Sort the right side of the array
			mergeSort(middle+1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {
		// Copy both parts into the helper array
		for(int i=low; i<= high; i++){
			this.helper[i] = this.numbers[i];
		}
		
		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
	    // to the original array
		while(i <= middle && j <= high){
			if(this.helper[i] <= this.helper[j]){
				this.numbers[k] = this.helper[i];
				i++;
			} else {
				this.numbers[k] = this.helper[j];
				j++;
			}
			k++;
		} //while ends
		
		// Copy the rest of the left side of the array into the target array
		while(i <= middle){
			this.numbers[k] = this.helper[i];
			i++;
			k++;
		}
	}
}