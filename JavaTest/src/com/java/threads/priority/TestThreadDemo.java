package com.java.threads.priority;
class TestThreadDemo 
{
	public static void main(String[] args) 
	{

		

    	ThreadDemo td = new ThreadDemo();
		Thread t1  = new Thread(td);
		t1.start();
		//System.out.println("ccc"+t1.getPriority());

		for(int i = 0 ; i < 20 ; i++)
		{
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
		System.out.println("Main " + i);		
		}

		System.out.println("Exiting Main()");
	}
}
