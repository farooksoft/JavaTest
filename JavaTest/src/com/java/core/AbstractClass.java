package com.java.core;

public abstract class AbstractClass implements TestIntereface{
	
	public abstract int multipl(int a, int b);
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}

}