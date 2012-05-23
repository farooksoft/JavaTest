package com.exam;

public class Producer implements Runnable {
Order o;
Producer(Order o)
{
	this.o=o;
	new Thread(this,"Producer").start();
}

public void run()
{
	int i=0;
	while(true){
		o.put(i++);
	}
  }
}
