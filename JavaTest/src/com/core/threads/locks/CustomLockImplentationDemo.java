package com.core.threads.locks;

/**
 * Demos Custom Lock implementation - like ReentrantLock
 * 
 * @author srayabar
 */
public class CustomLockImplentationDemo {
	
	public static void main(String[] args) {
		
		CustomLock lock = new CustomLock();
		
		System.out.println("before lock");
		
		try {
			lock.lock();
			System.out.println("after lock");
			lock.unlock();			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("after unclock");
		
	}
	
}

class CustomLock {
	
	boolean isLocked = false;
	
	public synchronized void lock() throws InterruptedException{
		while(isLocked){ //also called as Spin lock
			wait();
		}
		isLocked = true;
	}
	
	public void unlock(){
		isLocked = false;
		notify();
	}
	
}