package com.assign.day3;
/**
 * Assign Day4 - Prog4
 */
public class ClassAInterfaceDemo implements InterfaceFour {
	public static void main(String[] args) {
		ClassAInterfaceDemo aInterfaceDemo = new ClassAInterfaceDemo();
		aInterfaceDemo.MethodOne();
		aInterfaceDemo.MethodTwo();
		aInterfaceDemo.MethodThree();
		aInterfaceDemo.MethodFour();
	}
//	@Override
	public void MethodOne() {
	System.out.println("MethodOne");
		
	}
//	@Override
	public void MethodTwo() {
		System.out.println("MethodTwo");
		
	}
//	@Override
	public void MethodThree() {
		System.out.println("MethodThree");
		
	}
//	@Override
	public void MethodFour() {
		System.out.println("MethodFour");
		
	}
}