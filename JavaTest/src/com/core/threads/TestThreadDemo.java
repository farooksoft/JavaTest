package com.core.threads;

/**
 * test program for all adhoc thread concepts testing
 * 
 * @author srayabar
 */
public class TestThreadDemo extends Thread{

	@Override
	public void run() {
		System.out.println("hey.. I'm running..");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		TestThreadDemo demo = new TestThreadDemo();
		//starts thread run method
		demo.start();
		
		//starts main thread run method
		demo.run();
		System.out.println("main method ended");
	}
}