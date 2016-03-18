package com.dsalgo.stacks;

public class CustomStackDemo {
	
	public static void main(String[] args) {
		try {
			CustomStack<Integer> stack = new CustomStack<Integer>(10);
			stack.push(10);
			stack.push(12);
			stack.push(14);
			System.out.println(stack.peek());
			System.out.println("---");
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println("---");
			System.out.println(stack.peek());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * push
 * pop
 * peek 
 * 
 * @author srayabar
 *
 * @param <T>
 */
class CustomStack<T>{
	
	private T[] stackArray;
	private int size;
	private int top; //
	
	public CustomStack(int size) {
		stackArray = (T[])new Object[size];
		this.size = size;
		top = -1;
	}
	
	public T peek(){
		return stackArray[top];
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
		stackArray[++top] = t;
		System.out.println("Pushing :" + t);
	}
	
	public T pop() throws Exception{
		if(isStackEmpty()){
			throw new Exception("Stack is empty, Cann't pop an element");
		}
		return stackArray[top--];
	}

	private void increaseStackCapacity() {		
		T[] newStackArray = (T[])new Object[this.size * 2];
		for(int i=0;i<stackArray.length;i++){
			newStackArray[i] = stackArray[i];			
		}
		this.stackArray = newStackArray;
		this.size = this.stackArray.length;
	}
}