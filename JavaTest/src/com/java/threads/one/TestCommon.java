package com.java.threads.one;
class TestCommon extends Thread
{
	public static void main(String[] args) 
	{
		final Common c=new Common();
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
