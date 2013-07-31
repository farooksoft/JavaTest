package com.java.threads.priority;
class TestThreadPriorityDemo 
{
	public static void main(String[] args) 
	{
		ThreadPriorityDemo p=new ThreadPriorityDemo();
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(p);
		t1.start();
		t2.start();
		t3.start();
		for(int i=0;i<20;i++)
		System.out.println("Main "+i);
		System.out.println("Exiting Main");
	}
}
