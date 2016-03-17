package com.dsalgo.recursion;

import java.util.Stack;

public class TowerOfHanoiStackDemo {
	
	public static void main(String[] args) {
		TowerOfHanoiStackDemo stackDemo = new TowerOfHanoiStackDemo();
		
		Stack<Integer> a = new Stack<Integer>();
		Stack<Integer> b = new Stack<Integer>();
		Stack<Integer> c = new Stack<Integer>();
		
		a.push(1);
		a.push(2);
		a.push(3);
		
		stackDemo.toH(a.size(), a, b, c);
		System.out.println("print a");
		printStack(a);
		
		System.out.println("print b");
		printStack(b);
		
		System.out.println("print c");
		printStack(c);
	}
	
	private static void printStack(Stack<Integer> c) {
		for(int a : c){
			System.out.println(a);
		}
	}

	/**
	 * For n disks,
	 * 1. Move n-1 disks from a to b using c
	 * 2. Move a disk from a to c
	 * 3. Move n-1 disks from b to c using a 
	 * 
	 * @param n
	 * @param a
	 * @param b
	 * @param c
	 */
	public void toH(int n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c){
		
		if(n>0){
			toH(n-1, a, c, b);
			moveOneDisk(a, c);
			toH(n-1, b, a, c);
		}
	}

	private void moveOneDisk(Stack<Integer> a, Stack<Integer> c) {
		if(a.size() > 0)
			c.push(a.pop());
	}
	
}
