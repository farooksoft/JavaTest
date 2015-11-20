package com.dpattern.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator{
	
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		this.decoratedShape.draw();
		setRedBorder(this.decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Drawing Red border");
	}
}