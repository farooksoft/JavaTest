package com.core.threads;

/**
 * class to demo synchronized methods<br>
 * 
 * synchronized methods - would require intrinsic lock on the Class itself, meaning other synchronized blocks will 
 * wait till the first thread comes out of any synchronized method in the class<br>
 *    
 * synchronized blocks - don't require an intrinsic lock, rather depends on a passed object lock. This will not stop other threads to 
 * access any synchronized blocks in the same class
 * 
 * @author srayabar
 */
public class SynchronizedMethodsBlocksDemo{
	
	public static void main(String[] args) {
		
		final SynchronizedMethodsClass c = new SynchronizedMethodsClass();
		Thread t1 = new Thread() {
			public void run() {
				c.incrementer();
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				c.decrementer();
			}
		};
		t2.start();
	}
}

class SynchronizedMethodsClass {
	int counter;
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	
	public void incrementer() {
		
		//'this' in synchronized block is as good as synchronized method
		//synchronized (this) {
		
		synchronized (lock1) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void decrementer() {
		while (true) {
			counter--;
			System.out.println("Counter in Decrementer :" + counter);
			if (counter == -100)
				break;
		}
	}
}