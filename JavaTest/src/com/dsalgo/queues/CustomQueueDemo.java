package com.dsalgo.queues;

public class CustomQueueDemo {

}

/**
 * pop
 * push
 * isFull
 * isEmpty
 * 
 * @author srayabar
 *
 * @param <T>
 */

class CustomQueue<T>{
	
	private T[] queueArray;
	private int size;
	private int top;
	
	public CustomQueue(int size) {
		//create an object array and cast it to generic type T
		queueArray = (T[])new Object[size];
	}
		
}