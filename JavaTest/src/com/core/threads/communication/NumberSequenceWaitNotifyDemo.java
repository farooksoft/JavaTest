package com.core.threads.communication;

/**
 * program to inter thread communication for printing event and odd numbers each thread
 * 
 * Note: Can be achieved same with single thread with even/odd number print logic
 * 
 * @author srayabar
 */
public class NumberSequenceWaitNotifyDemo {
	
	public static void main(String[] args) {
		//common lock for both threads
		Object lock = new Object();
		
		Thread thread1 = new Thread(new EventNumberThread(lock));		
		Thread thread2 = new Thread(new OddNumberThread(lock));
		
		thread1.start();
		//to make sure thread2 starts only after thread1
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.start();
	}
}
/*
 * thread to print only event numbers
 */
class EventNumberThread implements Runnable{
	int counter = 0;
	Object lock;
	
	public EventNumberThread(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		
		while(true){
			synchronized (lock) {
				System.out.println("Thread-1 "+counter);
				try {
					Thread.sleep(1000);
					//first notify and wait
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				counter = counter + 2;
			}
		}
	}
}
/*
 * thread to print only odd numbers
 */
class OddNumberThread implements Runnable{
	
	int counter = 1;
	Object lock;
	
	public OddNumberThread(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		
		while(true){
			synchronized (lock) {
				System.out.println("Thread-2 "+counter);
				try {
					Thread.sleep(1000);
					//first notify and wait
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				counter = counter + 2;
			}
		}
	}
}