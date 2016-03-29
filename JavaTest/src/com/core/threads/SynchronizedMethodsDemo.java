package com.core.threads;

/**
 * class to demo synchronized methods
 * 
 * @author srayabar
 */
public class SynchronizedMethodsDemo{
	public static void main(String[] args) {
		final WellFormedCommon c = new WellFormedCommon();
		Thread t1 = new Thread() {
			public void run() {
				c.incrementer();
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				c.decrementer();
			}
		};
		t2.start();
	}
}

class WellFormedCommon {
	int counter;

	public synchronized void incrementer() {
		while (true) {
			counter++;
			System.out.println("Counter in Incrementer :" + counter);
			if (counter == 100)
				break;
		}

	}

	public synchronized void decrementer() {
		while (true) {
			counter--;
			System.out.println("Counter in Decrementer :" + counter);
			if (counter == 0)
				break;
		}

	}
}
