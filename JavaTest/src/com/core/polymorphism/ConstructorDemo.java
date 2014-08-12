package com.core.polymorphism;

/**
 * constructor creation and its overriding demo
 */
public class ConstructorDemo {
	public static void main(String[] args) {
		new ChildConst();
		new ChildConst("Valtech");
	}
}

class ParentConst {
	public ParentConst(String s) {
		System.out.println("Parent constructor called..." + s);
	}
}
