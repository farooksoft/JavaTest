package com.core.threads;

class SleepingThreadDemo {
	public static void main(String[] args) throws Exception {
		SleepingThread s = new SleepingThread();
		Thread t = new Thread(s);
		Thread t1 = new Thread(s);
		t.start();
		t1.start();
		System.out.println("SleepingThread Started");
		int i = 1;
		// while(i != 0)
		for (i = 1; i < 10; i++) {
			System.out.println("Main " + i);
			// i++;
		}
		System.out.println("Exiting Main");

	}
}
