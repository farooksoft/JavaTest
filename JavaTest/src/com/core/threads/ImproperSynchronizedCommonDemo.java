package com.core.threads;

public class ImproperSynchronizedCommonDemo extends Thread {
	public static void main(String[] args) {
		final ImproperSynchronizedCommon SC = new ImproperSynchronizedCommon();

		Thread t1 = new Thread() {
			public void run() {
				SC.incrementer();
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				SC.decrementer();
			}
		};
		t2.start();
	}
}
