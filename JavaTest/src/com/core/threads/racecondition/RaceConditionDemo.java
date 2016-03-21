package com.core.threads.racecondition;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * class to demo race condition in multi threading
 * 
 * Avoiding race condition:
 * 
 * @author srayabar
 *
 */
public class RaceConditionDemo {
	
	public static void main(String[] args) throws InterruptedException {
		//ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		
		ConsumerThread consumerThread1 = new ConsumerThread("Thread1");
		ConsumerThread consumerThread2 = new ConsumerThread("Thread2");
		
		Thread thread1 = new Thread(consumerThread1);
		Thread thread2 = new Thread(consumerThread2);
		
		thread1.setPriority(1);
		thread2.setPriority(1);
		
		thread1.start();

		//thread1.join();
		
		thread2.start();
		
		//executor.submit(consumerThread1);		
		//executor.submit(consumerThread2);		
		//executor.shutdown();
		
	}

}
