package com.dsalgo.stacks;

public class CustomStackDemo {
	
	public static void main(String[] args) {
		
	}

}

/**
 * push
 * pop
 * peak 
 * 
 * @author srayabar
 *
 * @param <T>
 */
class CustomStack<T>{
	
	private T[] stackArray;
	private int size;
	private int top;
	
	public CustomStack(int size) {
		stackArray = (T[])new Object[size];
		this.size = size;
		top = -1;
	}
	
	public boolean isStackFull(){
		return top == size-1;
	}
	
	public boolean isStackEmpty(){
		return top == -1;
	}
	
	public void push(T t){
		
		if(isStackFull()){
			System.out.println("Stack is Full, increasing the capacity!");
			increaseStackCapacity();
		}		
	}

	private void increaseStackCapacity() {
		
	}
}
