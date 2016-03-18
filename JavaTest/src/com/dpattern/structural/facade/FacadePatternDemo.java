package com.dpattern.structural.facade;

/**
 * Facade pattern - Exposing an Interface to callers there by hiding concrete implementations.Callers do not have 
 * to worry about how they have been implemented
 *    
 * @author srayabar
 */
public class FacadePatternDemo {

	public static void main(String[] args) {
		
		IShapeMakerFacade facade = new ShapeMakerFacade();
		facade.drawCircle();
		facade.drawRectangle();
		facade.drawTriangle();
	}
}