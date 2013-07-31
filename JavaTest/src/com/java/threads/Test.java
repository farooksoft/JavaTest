package com.java.threads;
public class Test 
{
	public static void main(String[] args) 
	{
         Activity a=new Activity();
		Thread t=new Thread(a);
		t.start();
		for(int i=0;i<10;i++)
		System.out.println("main Thread "+i);
	}
}
