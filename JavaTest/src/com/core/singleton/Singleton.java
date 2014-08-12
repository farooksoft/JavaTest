package com.core.singleton;

public class Singleton {
	static Singleton singleton;

	private Singleton() {
		System.out.println("cons called...");
	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
			return singleton;
		} else
			return singleton;
	}
}
