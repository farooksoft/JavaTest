package com.assign.day2;

public class Prog2 {
	int real;
	int imag;

	public Prog2(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}

	public void addComplex(Prog2 c2) {
		System.out.println("Addition of two complex Numbers is:"
				+ (this.real + c2.real) + "+" + (this.imag + c2.imag) + "i");
	}

	public static void main(String[] args) {

		Prog2 c = new Prog2(10, 20);
		Prog2 c1 = new Prog2(10, 30);
		c.addComplex(c1);

	}
}
