package com.dpattern.structural.decorator;

/**
 * wrapper class for all the classes which implements Shape interface
 * 
 * @author srayabar
 *
 */
public class ShapeDecorator implements Shape {

	public Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	@Override
	public void draw() {
		this.decoratedShape.draw();
	}

}
