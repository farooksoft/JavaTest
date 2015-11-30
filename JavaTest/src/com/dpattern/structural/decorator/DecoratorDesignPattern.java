package com.dpattern.structural.decorator;

public class DecoratorDesignPattern {
	
	public static void main(String[] args) {
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		//draws circle and adds extra  functionality
		redCircle.draw();
		//draws circle and adds extra  functionality
		redRectangle.draw();
	}
}