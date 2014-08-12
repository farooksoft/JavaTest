package com.core.threads;

public class ActivityThreadDemo {
	public static void main(String[] args) {
		ActivityThread a = new ActivityThread();
		Thread t = new Thread(a);
		t.start();
		for (int i = 0; i < 10; i++)
			System.out.println("main Thread " + i);
	}
}
