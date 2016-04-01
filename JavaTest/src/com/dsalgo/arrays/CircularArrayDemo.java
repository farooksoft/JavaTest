package com.dsalgo.arrays;

/**
	Implement a Circular Array class that supports an array-like data structure which
	can be efficiently rotated. The class should use a generic type, and should support
	iteration via the standard for (Obj o : circuLarArray) notation.

 * @author srayabar
 */
public class CircularArrayDemo {
	
	public static void main(String[] args) {
		
	}
}

class CircularArray<T>{
	private T[] items;
	private int head = 0;
	
	public CircularArray(int size) {
		items = (T[])new Object[size];		
	}
	
	public void rotate(int number){
		
	}
}
