package com.java.threads.one;
class ThreadDemo extends Thread
{
	public  void run() 
	{
		for(int i=0;i<10;i++)
		System.out.println("MyThread :"+i);
	}
}