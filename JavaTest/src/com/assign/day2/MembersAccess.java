package com.assign.day2;

/**
 * Assignment Program 9
 */
public class MembersAccess {
	public static void main(String[] args) {

	}
}

class classA {
	protected int j;
	public int k;
	int l;

	private void methodA() {
		System.out.println("classA : From methodA");
	}

	protected void methodB() {
		System.out.println("classA : From methodB");
	}

	public void methodC() {
		System.out.println("classA : From methodC");
	}

	void methodD() {
		System.out.println("classA : From methodC");
	}

}

class classB extends classA {
	protected int n;
	public int o;
	int p;

	private void methodE() {
		System.out.println("classB : From methodE");
	}

	protected void methodF() {
		System.out.println("classB : From methodF");
	}

	public void methodG() {
		System.out.println("classB : From methodG");
	}

	void methodH() {
		System.out.println("classB : From methodH");
	}

}