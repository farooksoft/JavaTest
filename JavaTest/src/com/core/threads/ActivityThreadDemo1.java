package com.core.threads;

class ActivityThreadDemo1 {
	public static void main(String[] args) {
		Common1 c = new Common1();
		ActivityThread1 a1 = new ActivityThread1();
		ActivityThread2 a2 = new ActivityThread2();
		Thread t1 = new Thread(a1);
		t1.start();
		Thread t2 = new Thread(a2);
		t2.start();
	}
}
