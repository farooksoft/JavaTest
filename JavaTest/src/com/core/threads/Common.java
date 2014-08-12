package com.core.threads;

class Common {
	int counter;

	public void incrementer() {
		while (true) {
			counter++;
			System.out.println("Counter in Incrementer :" + counter);
			if (counter == 100)
				break;
		}

	}

	public void decrementer() {
		while (true) {
			counter--;
			System.out.println("Counter in Decrementer :" + counter);
			if (counter == 0)
				break;
		}

	}
}
