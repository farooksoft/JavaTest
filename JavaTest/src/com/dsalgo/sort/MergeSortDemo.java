package com.dsalgo.sort;

import java.util.Arrays;

/**
 * Merge sort demo<p>
 * 
 * http://howtodoinjava.com/algorithm/merge-sort-java-example/<p>
 * 
 * @author srayabar
 */
public class MergeSortDemo {
	
	public static void main(String[] args) {		
		int[] array = new int[]{2, 4, 11, 9, 0, 7};
		mergeSort(array);
		System.out.println(Arrays.toString(array));
	}

	private static int[] mergeSort(int[] array) {
		
		if(array.length <= 1){
			return array;
		}
		
		int[] first = new int[array.length/2];
		int[] second = new int[array.length - first.length];
		
		//copy first half
		System.arraycopy(array, 0, first, 0, first.length);
		//copy second half
		System.arraycopy(array, first.length, second, 0, second.length);
		
		mergeSort(first);
		mergeSort(second);
		
		merge(first, second, array);
		
		return array;
	}

	/*
	 * merging two arrays and store in another array
	 */
	private static void merge(int[] first, int[] second, int[] array) {
		
		int iFirst = 0;
		int iSecond = 0;
		int iMerged = 0;
		
		while(iFirst < first.length && iSecond < second.length){
			if(first[iFirst] < second[iSecond]){
				array[iMerged] = first[iFirst];
				iFirst++;
			} else {
				array[iMerged] = second[iSecond];
				iSecond++;
			}
			iMerged++;
		}
		System.out.println("first->" + Arrays.toString(first));
		System.arraycopy(first, iFirst, array, iMerged, first.length-iFirst);
		
		System.out.println("second->" + Arrays.toString(second));
		System.arraycopy(second, iSecond, array, iMerged, second.length-iSecond);
	}
}