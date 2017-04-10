package com.core.threads;

import java.util.Date;

/**
 * test program for all adhoc thread concepts testing
 * 
 * @author srayabar
 */
public class TestThreadDemo{

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int count = 5;		
		while(count > 0){
			
			if(!TestThread.isStarted){
				new TestThread().start();
				try {
					Thread.sleep(1000L * 2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count --;
			}
			
		}
		
		System.out.println("main method completed");
	}
}

class TestThread extends Thread {
	static boolean isStarted = false;
	
	@Override
	public void run() {
		isStarted = true;
		System.out.println("From TestThread - " + new Date().toString());
	}
}