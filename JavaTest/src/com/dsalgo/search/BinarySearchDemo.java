package com.dsalgo.search;

/**
 * program for binary search - more efficient - O(log n) TC
 * 
 * check for middle element - found return 
 * else
 * check for left subset
 * or 
 * check for right subset
 * 
 * No array manipulations - just have start and end pointers
 * 
 * Note: Whole assumption of binary search tree works on notion - input array is sorted
 * 
 * @author srayabar
 */
public class BinarySearchDemo {
	
	public static void main(String[] args) {
		
		int[] array = {4, 6, 8, 9, 11};
		
		binarySearchIterative(array,array.length,8);
		binarySearchIterative(array,array.length,67);
		
		binarySearchRecursive(array,0, array.length,8);
		binarySearchRecursive(array,0, array.length,67);
		
		binarySearchRecursive1(array,0, array.length-1,8);
		binarySearchRecursive1(array,0, array.length-1,67);
		
		System.out.println("Found at index - " + binarySearchForFirstElement(array, array.length, 10));
		System.out.println("Found at index - " + binarySearchForLastElement(array, array.length, 10));
		
		System.out.println("Occurences - "+binarySearchElementsCounter(array, array.length, 10));
	}
	
	/**
	 * recursive - own example tweaked from iterative example
	 */
	public static void binarySearchRecursive(int[] array, int startt, int length, int ele){
		int start = startt;
		int end = length-1;		
		
		if(start <= end){
			int middle = start + (end - start)/2;			
			if(ele == array[middle]){
				System.out.println("found");
				return;
			}
			if(ele < array[middle]){
				binarySearchRecursive(array, start, middle-1, ele);
			}else{
				binarySearchRecursive(array, middle+1, length, ele);
			}
		}else{
			System.out.println("Not Found");
		}
	}
	
	/**
	 * text book style recursive binary search algo
	 */
	public static void binarySearchRecursive1(int[] array, int start, int end, int ele){
		
		if(start >= end){
			return;
		}
		
		int middle = start + (end-start)/2; //will avoid int overflow when compared with start+end
		if(ele == array[middle]){
			System.out.println("found");
			return;
		}
		if(ele < array[middle]){
			binarySearchRecursive1(array, start, middle-1, ele);
		}else{
			binarySearchRecursive1(array, middle+1, end, ele);
		}
		
	}
	
	/**
	 * iterative elegant way of simple binary search
	 * 
	 * Prefer iterative model against recursive
	 * hint - we don't have to store the status of whole call stack/traces
	 */
	public static void binarySearchIterative(int[] array, int length, int ele){
		int start = 0;
		int end = length-1;		
		boolean found = false;
		
		while(start <= end){
			int middle = (start+end)/2;
			//if middle matches then return
			if(ele == array[middle]){
				System.out.println(ele + " found");
				found = true;
				break;
			}
			//look for left side elements
			if(ele < array[middle]){
				end = middle-1;
			} else { //else right side elements
				start = middle+1;
			}
		}
		if(!found)
			System.out.println(ele+" not found");
	}
	
	/**
	 * method to search first element in array
	 * 
	 * @param array
	 * @param len
	 * @param ele
	 * @return {@link Integer}
	 */
	public static int binarySearchForFirstElement(int[] array, int len, int ele){
		int start = 0;
		int end = len-1;
		int index = -1;
		while(start <= end){
			int middle = start + (end-start)/2;
			if(ele == array[middle]){
				index = middle;
				end = middle-1;
			} else if(ele < array[middle]){
				end = middle-1;
			} else {
				start = middle+1;
			}
		}
		return index;
	}
	
	/**
	 * method to search last element in given array
	 * 
	 * @param array
	 * @param len
	 * @param ele
	 * @return {@link Integer}
	 */
	public static int binarySearchForLastElement(int[] array, int len, int ele){
		int result = -1;
		int start = 0;
		int end = len-1;
		while(start <= end){
			int middle = start + (end-start)/2;
			if(ele == array[middle]){
				result = middle;
				start = middle+1;
			} 
			else if(ele < array[middle]){
				end = middle-1;
			} else {
				start = middle+1;
			}
		}
		return result;
	}
	
	/**
	 * method to find number of occurrences of a numbers
	 * 
	 * Hint- count from first occurrence to last
	 * 
	 * @param array
	 * @param len
	 * @param ele
	 * @return
	 */
	public static int binarySearchElementsCounter(int[] array, int len, int ele){
		
		int start = binarySearchForFirstElement(array, len, ele);
		int last = binarySearchForLastElement(array, len, ele);
		
		if(start <= 0 && last <=0){
			return 0;
		}
		
		return (last-start)+1;
	}
	
}