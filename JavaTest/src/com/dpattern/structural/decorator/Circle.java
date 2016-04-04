package com.dpattern.structural.decorator;

public class Circle implements IShape {

	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}