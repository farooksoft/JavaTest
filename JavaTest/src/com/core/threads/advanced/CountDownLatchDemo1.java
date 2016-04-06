package com.core.threads.advanced;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author srayabar
 */
public class CountDownLatchDemo1 {
	
	private static CountDownLatch latch = new CountDownLatch(1);
	
	public static void main(String[] args) {
		
		ExecutorService fixedThreadPoolServ = Executors.newFixedThreadPool(5);
		for(int i=0; i<5; i++){
			fixedThreadPoolServ.submit(new Processor(latch, "Thread"+i));
		}
		
		try {
			//main thread will wait till all the submitted tasks are completed - no need to use join()
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed");
	}
}

class Processor implements Runnable{
	
	private CountDownLatch latch;
	private String name;
	
	public Processor(CountDownLatch latch, String name) {
		this.latch = latch;
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Started thread - " + this.name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.latch.countDown();
	}
}