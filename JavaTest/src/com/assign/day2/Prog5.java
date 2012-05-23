package com.assign.day2;

class Super {
	static int count = 0;

	public Super() {
		System.out.println("super class object is created");
		count++;
	}
}

class Sub extends Super {
	public Sub() {
		System.out.println("Sub class object is created");
		count++;
	}

	public void numberObj()

	{
		System.out.println("No of objects created are=" + count);
	}
}

public class Prog5 {
	public static void main(String[] args) {
		Sub s = new Sub();
		Super s1 = new Super();
		Sub s2 = new Sub();
		s2.numberObj();
	}

}
