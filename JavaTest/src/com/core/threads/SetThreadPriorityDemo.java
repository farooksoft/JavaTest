package com.core.threads;

class SetThreadPriorityDemo {
	public static void main(String[] args) {
		SetThreadPriority p = new SetThreadPriority();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		t1.setPriority(1);
		t2.setPriority(4);
		t3.setPriority(7);
		t1.start();
		t2.start();
		t3.start();
		for (int i = 0; i < 20; i++)
			System.out.println("Main " + i);
		System.out.println("Exiting Main");
	}
}
