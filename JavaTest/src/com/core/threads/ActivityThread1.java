package com.core.threads;

class ActivityThread1 implements Runnable {
	Common1 c;

	public void run() {
		c.incrementer();
	}
}
