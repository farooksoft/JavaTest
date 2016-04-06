package com.core.threads;

import java.util.Scanner;

/**
 * program to use volatile keyword for thread synchronization<br>
 * 
 * idea - volatile keyword for a variable makes sure that the multiple threads doesn't cache the variable and everytime they read 
 * full value from disk. Good for basic thread synchronization
 * 
 * @author srayabar
 */
public class ThreadSyncVolatileDemo {
	public static void main(String[] args) {
		Processor processor = new Processor();
		Thread thread = new Thread(processor);
		thread.start();
		
		//some event to shutdown
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		processor.shutdown();
	}
}

class Processor implements Runnable{
	
	// avoids thread caching for this variable 
	private volatile boolean running = true;
	
	@Override
	public void run() {
		while(running){
			System.out.println("running..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(){
		running = false;
	}
}