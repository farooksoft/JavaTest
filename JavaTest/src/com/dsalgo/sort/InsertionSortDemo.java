package com.dsalgo.sort;

import java.util.Arrays;

/**
 * 
 * @author srayabar
 */
public class InsertionSortDemo {

	public static void main(String[] args) {
		
		int[] array = new int[]{4, 1, 6, 99, 34, 7, 6, 12};
		int j, tmp;
		
		//start from second element
		for(int i=1; i<array.length; i++){
			
			//store i value in tmp
			tmp = array[i];
			
			//i-1 value is bigger than i values - swap
			for(j=i; j>0 && tmp < array[j-1]; j--){
				array[j] = array[j-1];
			}
			//finally place the last value
			array[j] = tmp;
		}
		
		System.out.println(Arrays.toString(array));
	}
}
