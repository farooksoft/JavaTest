package com.core.threads;

class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority p = new ThreadPriority();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		t1.start();
		t2.start();
		t3.start();
		for (int i = 0; i < 20; i++)
			System.out.println("Main " + i);
		System.out.println("Exiting Main");
	}
}
