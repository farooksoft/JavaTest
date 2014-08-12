package com.core.threads;

public class WellFormedCommon {
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
