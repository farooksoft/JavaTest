package com.java.core.multithreading;

public class CreateThread implements Runnable {
 Thread t;
 int money;
 ReservationCounter counter;
 public CreateThread
 (String name,int money,ReservationCounter counter)
 {
	this.counter=counter;
	this.money=money;
	t=new Thread(this,name);
	t.start();
   }
 public void run()
 {
	 //synchronized(counter)
	 //{
	 Thread t=Thread.currentThread();
	 
	 counter.bookTicket(money);
	 counter.giveChange();
	   //}
	}
}
