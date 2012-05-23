package com.assign.day3;
/**
 * Assign Day3 - Prog2
 */
public class Square implements CalcArea {
	double side;
	public Square(double side) {
		this.side= side;
	}
	public static void main(String[] args) {
		Square square = new Square(15);
		square.findArea();
	}
//	@Override
	public void findArea() {
		System.out.println("Cirle Area is "+side*side);
	}
}
