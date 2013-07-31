package com.java.threads.one;
class TestWellFormedCommon extends Thread
{
	public static void main(String[] args) 
	{
		final WellFormedCommon c=new WellFormedCommon();
		Thread t1=new Thread()
		{
			public void run()
			{
				c.incrementer();
			}
		};
		t1.start();
		Thread t2=new Thread()
		{
			public void run()
			{
				c.decrementer();
			}
		};
		t2.start();
	}
}
