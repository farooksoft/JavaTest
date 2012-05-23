package com.test.day5.threadpack;

public class ReservationCounter {
	int money;
	public void bookTicket(int money){
		Thread thread = Thread.currentThread();
		this.money = money;
		System.out.println(thread.getName()+": is booking the ticket");
		try {Thread.sleep(1000);}catch(Exception e){System.out.println("Exception Thread sleep");}
	}
	public void giveChange(){
		Thread thread = Thread.currentThread();
//		try {Thread.sleep(100);}catch(Exception e){System.out.println("Exception Thread sleep");}
		System.out.println("Gives change "+ (money-100) +" to "+thread.getName());
	}
}
