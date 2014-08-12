package com.core.threads;

class AnonymousThreadDemo {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++)
					System.out.println("MyThread :" + i);
			}
		};
		t.start();
		for (int i = 0; i < 20; i++)
			System.out.println("MainThread :" + i);

	}
}
