package com.core.exceptions;

public class ExcepDemo {
	public static void main(String[] args) {
		try {
			int i = 1 / Integer.parseInt(args[0]);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		} catch (NumberFormatException ne) {
			System.out.println(ne);
		} finally {
			System.out.println("finally.....");
		}
		System.out.println("after exception");
	}
}
