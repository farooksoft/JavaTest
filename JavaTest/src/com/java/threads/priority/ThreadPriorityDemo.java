package com.java.threads.priority;
class ThreadPriorityDemo implements Runnable 
{
	public  void run() 
	{
		for(int i=0;i<5;i++)
		{
			Thread t=Thread.currentThread();
			System.out.println("ChildThreadName is "+t.getName());
			System.out.println("ChildThreadPriority is "+t.getPriority());
          	System.out.println("Child "+i);
		}
	}
}
