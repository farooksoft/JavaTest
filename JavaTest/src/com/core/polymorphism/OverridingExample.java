package com.core.polymorphism;

/**
 * Overriding demo on class A and B
 * <p>
 * Method signature should not be change (params,return types etc)
 */
public class OverridingExample {
	public static void main(String[] args) {
		A a = new B();
		a.callMe();
	}
}

class A {
	void callMe() {
		System.out.println("From class A");
		// return 1;
	}
}

class B extends A {

	@Override
	void callMe() {
		System.out.println("From class B");
		super.callMe();
	}
}
