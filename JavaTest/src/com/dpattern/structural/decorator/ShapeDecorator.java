package com.dpattern.structural.decorator;

/**
 * wrapper class for all the classes which implements Shape interface
 * 
 * @author srayabar
 */
public class ShapeDecorator implements IShape {

	public IShape decoratedShape;
	
	public ShapeDecorator(IShape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	@Override
	public void draw() {
		this.decoratedShape.draw();
	}
}
