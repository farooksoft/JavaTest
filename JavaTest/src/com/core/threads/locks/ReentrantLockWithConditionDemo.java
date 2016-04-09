package com.core.threads.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * program to demo reentrant lock and condition for thread synchronization - alternative to wait and notify
 * 
 * @author srayabar
 */
public class ReentrantLockWithConditionDemo {

	public static void main(String[] args) {
		
		Runner runner = new Runner();
		
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					runner.firstThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				runner.secondThread();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		runner.finished();
	}
}

class Runner {
	private int counter = 0;
	//can lock more than once - need unlock with same number of times
	private ReentrantLock lock = new ReentrantLock();
	//get a condition from lock
	private Condition condi = this.lock.newCondition();
	
	//sometimes below two thread methods can interleave counter, pushing it to unknown results - we need locks to avoid this
	public void increment(){
		for(int i=0; i<1000; i++){
			this.counter ++;
		}
	}
	
	public void firstThread() throws InterruptedException{
		//when locks are used - no need of synchronized methods/blocks
		this.lock.lock();
		
		//as good as Object wait method
		this.condi.await();		
		System.out.println("wait is over");
		try{
			increment();
		}finally{ //good practice
			this.lock.unlock();
		}
	}
	
	public void secondThread(){
		//when locks are used - no need of synchronized methods/blocks
		this.lock.lock();
		
		//as good as Object notify method
		this.condi.signal();
		System.out.println("signalled");
		try{
			increment();
		}finally{ //good practice
			this.lock.unlock();
		}
	}
	
	public void finished(){
		System.out.println("finished - "+this.counter);
	}	
}