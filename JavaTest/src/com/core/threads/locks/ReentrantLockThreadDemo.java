package com.core.threads.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * If a thread already holds the lock on a monitor object, it has access to all blocks synchronized on the same monitor object. 
 * This is called reentrance. The thread can reenter any block of code for which it already holds the lock.
 * 
 * @author srayabar
 */
public class ReentrantLockThreadDemo {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ReentrantTestThread());
		Thread t2 = new Thread(new ReentrantTestThread());
		
		t1.start();
		t2.start();
	}
}

class ReentrantTestThread implements Runnable{

	@Override
	public void run() {
		Lock lock = new ReentrantLock();
		
		System.out.println("1");
		
		try {
			lock.lock();
			
			System.out.println("2");			
			System.out.println("3");
			
		}finally{
			lock.unlock(); //always put unlock in finally block			
		}
	}	
}