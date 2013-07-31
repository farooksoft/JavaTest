package com.java.threads.alive;
class AliveThreadDemo implements Runnable 
{
	public void run()
	{
		
		for(int i = 0; i < 5 ; i++)
		{

		Thread t = Thread.currentThread();
		System.out.println("ChildThread Priority is "+t.getPriority());
		System.out.println("ChildThread is Alive "+t.isAlive());
		System.out.println("Child " +i);
		}

		

	}
}
