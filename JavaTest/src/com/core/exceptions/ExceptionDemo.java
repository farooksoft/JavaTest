package com.core.exceptions;

public class ExceptionDemo {

	@Override
	public String toString() {
		return "this is the message bbla bla bla...";
	}

	public static void main(String[] args) {
		try {
			int i = 1 / Integer.parseInt(args[0]);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		} catch (NumberFormatException ne) {
			System.out.println(ne);
		} finally {
			System.out.println("finally.....");
		}
		System.out.println("after exception....");
	}
}