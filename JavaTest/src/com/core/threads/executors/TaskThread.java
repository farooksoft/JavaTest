package com.core.threads.executors;

import java.util.concurrent.TimeUnit;

public class TaskThread implements Runnable{
	
	private String name;
	
	public TaskThread(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public void run() {
		Long duration = (long) (Math.random() * 10);		
		System.out.println("Running Task : " + this.name);
		
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}