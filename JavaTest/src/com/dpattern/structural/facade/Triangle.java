package com.dpattern.structural.facade;

import com.dpattern.structural.decorator.Shape;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Triangle..");
	}

}
