package com.core.threads.advanced;

import java.util.concurrent.CountDownLatch;

/**
 * A CountDownLatch is initialized with a given count. This count is decremented by calls to the countDown() method. 
 * Threads waiting for this count to reach zero can call one of the await() methods. Calling await() blocks the thread 
 * until the count reaches zero.
 * 
 * @author srayabar
 */
public class CountDownLatchDemo2 {
	
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		
		//waiter waits till the latch counter is zero and then executes 
		Waiter waiter = new Waiter(latch);
		
		//decrementer decrements latch counter count
		Decrementer decrementer = new Decrementer(latch);
		
		new Thread(waiter).start();
		new Thread(decrementer).start();		
	}
}

class Decrementer implements Runnable{
	private CountDownLatch latch;
	public Decrementer(CountDownLatch latch) {
		this.latch = latch;
	}
	public void run() {
		
		try {
			Thread.sleep(2000);
			latch.countDown();
			Thread.sleep(2000);
			latch.countDown();
			Thread.sleep(2000);
			latch.countDown();//count is reduced to 0 here
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	};
}

class Waiter implements Runnable{
	
	private CountDownLatch latch;
	public Waiter(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		
		try {
			latch.await(); //the moment latch counter is 0, this thread resumes it's work
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Waiter released..");
	}
}