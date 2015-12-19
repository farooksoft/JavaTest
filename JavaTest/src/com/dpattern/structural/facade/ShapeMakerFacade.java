package com.dpattern.structural.facade;

public class ShapeMakerFacade implements IShapeMakerFacade {

	private Circle circle ;
	private Rectangle rectangle ;
	private Triangle triangle ;
	
	public ShapeMakerFacade() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.triangle = new Triangle();
	}
	
	@Override
	public void drawCircle() {
		this.circle.draw();
	}

	@Override
	public void drawTriangle() {
		this.rectangle.draw();
	}

	@Override
	public void drawRectangle() {
		this.triangle.draw();
	}

}
