package com.core.threads;

class ActivityThread2 implements Runnable {
	Common1 c;

	public void run() {
		c.decrementer();
	}
}