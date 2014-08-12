package com.core.strings;

public class ImmutabilityDemo {

	public static void main(String[] args) {
		ImmutabilityDemo demo = new ImmutabilityDemo();
		demo.checkStringImmutability();
		System.out.println("-------------------");
		demo.checkIntegerImmutability();
	}

	private void checkIntegerImmutability() {

		int one = 1;
		System.out.println("One -->"+1);
		
		int two = one;
		
		one = 2;
		
		System.out.println("one1-->"+one);
		System.out.println("two-->"+two);
	}

	private void checkStringImmutability() {
		String a="a";
		System.out.println("a 1-->"+a);
		
		String b=a;
		
		a="ty";
		
		System.out.println("a 2-->"+a);
		System.out.println("b  -->"+b);
		
	}

}
