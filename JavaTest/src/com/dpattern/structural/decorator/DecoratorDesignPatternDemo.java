package com.dpattern.structural.decorator;

public class DecoratorDesignPatternDemo {
	
	public static void main(String[] args) {
		
		IShape redCircle = new RedShapeDecorator(new Circle());
		
		IShape redRectangle = new RedShapeDecorator(new Rectangle());
		
		//draws circle and adds extra  functionality
		redCircle.draw();
		//draws circle and adds extra  functionality
		redRectangle.draw();
	}
}