package com.core.threads;

class Operation1 implements Runnable {
	public void run() {
		try {
			Thread.sleep(200);
			System.out.println("Operation1 completed");
		} catch (InterruptedException e) {
			System.out.println("InterruptedException is caught");
		}

	}
}
