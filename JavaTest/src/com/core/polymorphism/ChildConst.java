package com.core.polymorphism;


public class ChildConst extends ParentConst {
	public ChildConst() {
		super("srinath");
		System.out.println("Child constructor called...");
	}

	public ChildConst(String s) {
		super(s);
		System.out.println("Child constructor called...");
	}
}
