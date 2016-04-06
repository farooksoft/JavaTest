package com.core.threads.communication;

/**
 * program to inter thread communication for printing event and odd numbers each thread 
 * 
 * @author srayabar
 */
public class NumberSequenceWaitNotifyDemo {
	
	public static void main(String[] args) {
		//common lock for both threads
		Object lock = new Object();
		
		new Thread(new Thread1(lock)).start();
		new Thread(new Thread2(lock)).start();
	}
}

class Thread1 implements Runnable{
	int counter = 0;
	Object lock;
	
	public Thread1(Object lock) {
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
					lock.notifyAll();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				counter = counter + 2;
			}
		}
	}
}

class Thread2 implements Runnable{
	
	int counter = 1;
	Object lock;
	
	public Thread2(Object lock) {
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
					lock.notifyAll();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				counter = counter + 2;
			}
		}
	}
}