package com.assign.day5;

public class CreateThreadOnceStart implements Runnable {
	
	public CreateThreadOnceStart() {
		Thread thread = new Thread("firstThread");
		thread.start();
	}
//	@Override
	public void run() {
		System.out.println("First thread running");
	}
}
