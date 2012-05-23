package com.test;

public class Base
{
	String Method()
    {
		return "Wow";
    }
}
 class Derived
    {
	 public void useD()
	 {
		Base z=new Base();
		System.out.println("base says," +z.Method());
	 }
 }