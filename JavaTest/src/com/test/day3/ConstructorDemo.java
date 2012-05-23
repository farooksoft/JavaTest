package com.test.day3;

/**
 * constructor creation and its overriding demo
 */
public class ConstructorDemo {
	public static void main(String[] args) {
		new ChildConst();
		new ChildConst("Valtech");
	}
}

class ParentConst{
	public ParentConst(String s) {
		System.out.println("Parent constructor called..."+s);
	}
}
class ChildConst extends ParentConst{
	public ChildConst() {
		super("srinath");
		System.out.println("Child constructor called...");
	}
	public ChildConst(String s) {
		super(s);
		System.out.println("Child constructor called...");
	}
}
