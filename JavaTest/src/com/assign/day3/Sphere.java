package com.assign.day3;
/**
 * Assign Day3 - Prog2
 */
public class Sphere implements CalcArea, CalcVolume{
	double radius;
	double pi = 3.14;
	public Sphere(double radius) {
			this.radius = radius;
	}
	public static void main(String[] args) {
		Sphere cuboid = new Sphere(15);
		cuboid.findArea();
		cuboid.findVolume();
	}
//	@Override
	public void findArea() {
		System.out.println("Sphere Area is "+pi*radius*radius);
	}
//	@Override
	public void findVolume() {
		System.out.println("Sphere Volume is "+(4/3)*pi*radius*radius*radius);
	}
	
}
