package com.java.core.multithreading;

public class ReservationCounter {
int money;
synchronized public void bookTicket(int money)
{
	this.money=money;
	Thread t=Thread.currentThread();
	System.out.println(t.getName() + ":is booking the ticket");
	try{
		Thread.sleep(100);
	  }catch(Exception e)
	  {}
   }
synchronized public void giveChange()
{
	Thread t=Thread.currentThread();
	System.out.println("gives change" +(money-100) +t.getName());
  }
}
