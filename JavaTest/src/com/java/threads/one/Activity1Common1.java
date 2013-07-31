package com.java.threads.one;
class Activity1Common1 implements Runnable
{
	Common1 c;
	public  void run() 
	{
		c.incrementer();
	}
}
