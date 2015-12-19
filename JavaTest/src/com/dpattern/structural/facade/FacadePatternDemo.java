package com.dpattern.structural.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
		
		IShapeMakerFacade facade = new ShapeMakerFacade();
		facade.drawCircle();
		facade.drawRectangle();
		facade.drawTriangle();
		
	}
}
