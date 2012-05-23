package com.assign.day5;

public class CreateThreadAccess implements Runnable {
	Thread thread;String name;
	
	public CreateThreadAccess(String name) {
		this.name = name;
		thread = new Thread(this,name);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.start();
	}
//	@Override
	public void run() {
		synchronized (name) {
			System.out.println("--------"+name+" Accessing --------");
		}
	}
}
