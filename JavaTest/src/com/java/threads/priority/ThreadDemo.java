package com.java.threads.priority;
class ThreadDemo implements Runnable 
{

	public void run()
	{
		
		for(int i = 0; i < 5 ; i++)
		{
		Thread t = Thread.currentThread();
		System.out.println("ChildThread Priority is "+t.getPriority());
		System.out.println("Child " +i);
		}

		

	}

}
