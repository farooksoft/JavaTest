package com.day3.morning;

class Parent
{
	final int x=10;
	public void display()
 {
	System.out.println("Parent display");
 }
}

final class ChildOne extends Parent
{
	public void show()
	{
		System.out.println("child with final");
	}
}

public class FinalDemo {
  public static void main(String[] args) {
	  Parent p=new Parent();
}
}
