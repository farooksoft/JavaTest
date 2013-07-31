package com.java.threads.synchronization;
public class TestSynchronizedCommon extends Thread
{
	public static void main(String[] args) 
	{
		final SynchronizedCommon SC=new SynchronizedCommon();
		
		Thread t1=new Thread()
		{
			public void run()
			{
				SC.incrementer();
			}
		};
		t1.start();

		Thread t2=new Thread()
		{
			public void run()
			{
				SC.decrementer();
			}
		};
		t2.start();
	}
}
