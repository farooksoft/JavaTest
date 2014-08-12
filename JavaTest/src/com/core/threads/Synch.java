package com.core.threads;

class Callme {
	synchronized void call(String message) {
		System.out.println("[" + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
	}
}

class Caller implements Runnable {
	String message;
	Synch target;
	Thread t;

	public Caller(Synch target, String message) {
		this.message = message;
		this.target = target;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		synchronized (target) {
			target.call(message);
		}
	}

}

public class Synch {
	public static void main(String[] args) {
		Synch target = new Synch();
		Caller c1 = new Caller(target, "hi");
		Caller c2 = new Caller(target, "hello");
		Caller c3 = new Caller(target, "synchronized");

		try {
			c1.t.join();
			c2.t.join();
			c3.t.join();
		} catch (InterruptedException ie) {
			System.out.println("interrupted");
		}
	}

	public void call(String message) {
		// TODO Auto-generated method stub

	}
}
