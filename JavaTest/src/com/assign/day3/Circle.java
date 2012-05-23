package com.assign.day3;
/**
 * Assign Day3 - Prog2
 */
public class Circle implements CalcArea{
	int radius;
	double p = 3.14;
	public Circle(int radius) {
		this.radius = radius;
	}
	public static void main(String[] args) {
		Circle circle = new Circle(15);
		circle.findArea();
	}
	public void findArea() {
		System.out.println("Cirle Area is "+p*radius*radius);
	}
}
