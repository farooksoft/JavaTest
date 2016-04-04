package com.dpattern.structural.decorator;

//public class RedShapeDecorator extends ShapeDecorator{

/**
 * this class is to add extra functionality to an existing object - basically key class in this design pattern
 * 
 * @author srayabar
 */
public class RedShapeDecorator implements IShape{
	
	IShape decoratedShape;
	
	public RedShapeDecorator(IShape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	@Override
	public void draw() {
		this.decoratedShape.draw();
		//adding extra functionality to passed shapeObject
		setRedBorder(this.decoratedShape);
	}
	
	//method to add color to border
	private void setRedBorder(IShape decoratedShape) {
		System.out.println("Drawing Red border");
	}
}