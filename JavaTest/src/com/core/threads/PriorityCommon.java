package com.core.threads;

public class PriorityCommon {
	int counter;

	public void incrementer() {
		while (true) {
			counter++;
			System.out.println("Counter in Incremeter= " + counter);
			if (counter == 100)
				break;
		}
	}

	public void decrementer() {
		while (true) {
			counter--;
			System.out.println("Counter in decremeter= " + counter);
			if (counter == -10)
				break;
		}
	}

}
