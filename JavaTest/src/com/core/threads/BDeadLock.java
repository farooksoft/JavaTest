package com.core.threads;

public class BDeadLock {

	synchronized void bar(ADeadLock aDeadLock) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered BDeadLock.foo()");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("BDeadLock interrupted");
		}
		System.out.println(name + " trying to call ADeadLock.last()");
		aDeadLock.last();
	}

	synchronized void last() {
		System.out.println("Inside BDeadLock.last()");
	}

}