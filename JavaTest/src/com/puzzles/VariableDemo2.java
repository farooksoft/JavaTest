package com.puzzles;

public class VariableDemo2 {
	int i = 300;
	byte b = 76;
	String s1 = "hello";
	String s2 = new String("world");
	char c = 'a';
	boolean t = true;

	public static void main(String args[]) {
		VariableDemo2 d = new VariableDemo2();
		d.i = d.b;
		d.b = (byte) d.i;

		System.out.println("byte b is" + d.b);
		System.out.println("int b is" + d.i);
		System.out.println("concat:" + d.s1 + "\n" + d.s2);
		System.out.println("boolean is" + d.t);
	}

}
