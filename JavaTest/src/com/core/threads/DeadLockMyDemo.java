package com.core.threads;

public class DeadLockMyDemo implements Runnable {

	ADeadLock aDeadLock = new ADeadLock();
	BDeadLock bDeadLock = new BDeadLock();

	public DeadLockMyDemo() {
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this, "Racing thread");
		t.start();

		// getting lock on aDeadLock in this thread
		aDeadLock.foo(bDeadLock);
		System.out.println("Back in main thread");
	}

	@Override
	public void run() {
		// get lock on bDeadLock in this thread
		bDeadLock.bar(aDeadLock);

		System.out.println("Back in other thread");
	}

	public static void main(String[] args) {
		new DeadLockMyDemo();
	}

}
