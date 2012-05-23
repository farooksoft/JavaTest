package com.assign.day2;

class A {
	protected int prt;
	public int pub;

	protected void prt() {
		System.out.println("This is Protected Method of class A");
	}

	public void pub() {
		System.out.println("This is public Method of Class A");
	}
}

class B extends A {
	int x = 2;

	protected void hello(int l) {
		// pr=l;//private is not visible
		prt = l;
		pub = l;
		System.out
				.println("In class B Sum of Protectd and public variable values are"
						+ prt + pub);
	}
}

public class Prog9 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("x=" + b.x);
		b.hello(32);
		// b.pr();//Private method is not visible
		b.prt();
		b.pub();
	}
}
