package com.day2.noon;

public class WrapperDemo {
  public static void main(String[] args) {
	int i=10;
	//wrapping a primitive type to complex type
	Integer ii=new Integer(i);
	System.out.println(ii.intValue());
	String s="123";
	String s2="123";
	System.out.println(Integer.parseInt(s)+ Integer.parseInt(s2));
    }
}
