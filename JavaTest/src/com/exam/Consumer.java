package com.exam;

public class Consumer implements Runnable {
Order o;
Consumer(Order o)
{
	this.o=o;
	new Thread(this,"Consumer").start();
  }
public void run()
{
	while(true)
	{
		o.get();
	}
  }
}
