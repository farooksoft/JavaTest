package com.dpattern.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator{
	
	public RedShapeDecorator(IShape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		this.decoratedShape.draw();
		setRedBorder(this.decoratedShape);
	}

	private void setRedBorder(IShape decoratedShape) {
		System.out.println("Drawing Red border");
	}
}