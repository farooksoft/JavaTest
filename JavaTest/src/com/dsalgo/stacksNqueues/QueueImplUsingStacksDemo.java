package com.dsalgo.stacksNqueues;

import java.util.Stack;

/**
 * program to implement queue using two stacks
 * 
 * @author srayabar
 */
public class QueueImplUsingStacksDemo {
	
	public static void main(String[] args) {
		//in type reference - no need to pass String to new Object
		QueueUsingStacks<String> queue = new QueueUsingStacks<String>();
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue()); //could cause an exception
	}
}

/*
 * generic queue class
 */
class QueueUsingStacks<E>{
	
	private Stack<E> inbound = new Stack<E>();
	private Stack<E> outbound = new Stack<E>();
	
	public void enqueue(E element){
		this.inbound.push(element);
	}
	
	public E dequeue(){
		while(!this.inbound.isEmpty()){
			this.outbound.push(this.inbound.pop());
		}
		return this.outbound.pop();
	}
}