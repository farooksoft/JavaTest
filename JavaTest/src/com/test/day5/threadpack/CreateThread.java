package com.test.day5.threadpack;

public class CreateThread implements Runnable{
	Thread thread; 
	ReservationCounter counter;
	int money;
	public CreateThread(String name,int money,ReservationCounter counter) {
		this.counter = counter;
		this.money = money;
		thread = new Thread(this,name);
		thread.start();
	}
//	@Override
	public void run() {
		synchronized (counter) {
			counter.bookTicket(money);
			counter.giveChange();	
		}
	}
}
