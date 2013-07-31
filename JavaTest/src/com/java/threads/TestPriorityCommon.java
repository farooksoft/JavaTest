package com.java.threads;
public class TestPriorityCommon extends Thread
{
	public static void main(String[] args) 
	{
		final PriorityCommon PC=new PriorityCommon();
		
		Thread t1=new Thread()
		{
			public void run()
			{
				PC.incrementer();
			}
		};
		

		Thread t2=new Thread()
		{
			public void run()
			{
				PC.decrementer();
			}
		};
		t1.start();
		t2.start();
		System.out.println("Priority of Thread t1 before setting Priority "+t1.getPriority());
		System.out.println("Priority of Thread t2 before setting Priority "+t2.getPriority());
	}
}

