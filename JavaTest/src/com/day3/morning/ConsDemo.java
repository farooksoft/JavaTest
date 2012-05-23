package com.day3.morning;


class ParentConstructor
{
 public ParentConstructor(String s)
 {
	 System.out.println("Parent Constructor is called");
 }
}


public class ConsDemo extends ParentConstructor
{
	public ConsDemo()
	{
		super("gjdf");
		System.out.println("Child no argument constructor");
	}
	public ConsDemo(String s)
	{
		super("dfdj");
		System.out.println("Child one argument constructor");
	}

  public static void main(String[] args)
  {
    new ConsDemo();
    new ConsDemo("dfdjf");
   }
}