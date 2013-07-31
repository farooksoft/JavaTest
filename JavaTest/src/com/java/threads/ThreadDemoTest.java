package com.java.threads;
public class ThreadDemoTest 
{
	public static void main(String[] args) 
	{
		ThreadDemo td=new ThreadDemo();
		td.start();
		for(int i=0;i<10;i++)
		System.out.println("main Thread i= "+i);
	}
}
