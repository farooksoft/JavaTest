package com.assign.day2;

class A2 {
	public A2(String s) {
		System.out.println("Constructor of A1");
		System.out.println("Constructor of A1");

	}
}

class B2 {
	public B2(int n) {
		System.out.println("Constructor of B");
	}
}

class C2 extends A2 {
	public C2() {
		super("hello");
		System.out.println("Constructor C");
		new B2(2);
	}

}

public class Prog11 {
	public static void main(String[] args) {
		C2 c = new C2();
	}

}
