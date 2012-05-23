package com.assign.day2;

public class Prog1 {

	int ar[] = { 1, 2, 3 };

	public void mul(int a, int b) {
		System.out.println("Multiplication is" + a * b);
	}

	public void dispArray(int[] ar) {
		System.out.println("Array elements are");
		for (int i = 0; i < ar.length; i++)
			System.out.println(ar[i]);
	}

	public void obj(Prog1 p) {
		System.out.println("The object of Prog1 is=" + p);
	}

	public static void main(String[] args) {

		String shubha = "abc123";
		System.out.println(shubha.contains("abc"));

		StringBuffer sb = new StringBuffer("2ab3c123efg1");
		System.out.println(sb.indexOf("123"));

		// Prog1 p=new Prog1();
		// p.mul(10,10);
		// p.dispArray(p.ar);
		// p.obj(p);

	}

}
