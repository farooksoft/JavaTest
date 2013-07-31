package com.java.threads.one;
class Activity2Common1 implements Runnable
{
	Common1 c;
	public  void run() 
	{
		c.decrementer();
	}
}