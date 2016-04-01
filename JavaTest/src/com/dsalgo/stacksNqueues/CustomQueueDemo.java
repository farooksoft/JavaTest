package com.dsalgo.stacksNqueues;

/**
 * custom queue implementation - 
 * 1. enqueue elements from 0th index
 * 2. dequeue elements from 0th index
 * 
 * @author srayabar
 *
 */
public class CustomQueueDemo {
	
	public static void main(String[] args) {
		
		CustomQueue<String> custQueue = new CustomQueue<String>(5);
		custQueue.enqueue("a");
		custQueue.enqueue("b");
		custQueue.enqueue("c");
		custQueue.enqueue("d");
		custQueue.enqueue("e");
		custQueue.enqueue("f");
		System.out.println("Dequeued " + custQueue.dequeue());
		System.out.println("Dequeued " + custQueue.dequeue());
		System.out.println("Dequeued " + custQueue.dequeue());
		System.out.println("Dequeued " + custQueue.dequeue());
		System.out.println("Dequeued " + custQueue.dequeue());
		System.out.println("Dequeued " + custQueue.dequeue());
	}
}

/**
 * enqueue
 * dequeue
 * isFull
 * isEmpty
 * 
 * @author srayabar
 *
 * @param <T>
 */
class CustomQueue<T>{
	
	private T[] queueArray;	
	private int capacity;	
	private int front = 0;
	private int rear = -1;
	private int currentSize = 0;	
	
	public CustomQueue(int size) {
		//create an object array and cast it to generic type T
		this.queueArray = (T[])new Object[size];
		this.capacity = size;
	}
	
	//if full, capacity is equal to current size
	public boolean isFull(){
		return this.capacity == this.currentSize;
	}
	
	//if empty, currentsize is 0
	public boolean isEmpty(){
		return this.currentSize == 0;
	}
	
	public void enqueue(T t){
		if(isFull()){
			System.out.println("Hey! Queue is Full");
			return;
		}
		//increment rear as it started from -1
		this.rear++;
		
		//enqueue element to rear index
		this.queueArray[this.rear] = t;
		
		//update currentsize accordingly
		this.currentSize ++;
		System.out.println("Enqueued " + t);
	}
	
	public T dequeue(){
		if(isEmpty()){
			System.out.println("Hey! Queue is Empty");
			return null;
		}
		//increment front here but do -1 below
		this.front ++;
		
		//decrement currentsize
		this.currentSize --;
		
		//return front index element from queue array
		return this.queueArray[this.front-1];
	}
}