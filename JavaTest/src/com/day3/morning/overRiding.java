package com.day3.morning;

public class overRiding {
   public static void main(String[] args)
   {
       ParentOne p=new ParentOne();
	   p.walk();
   }
	
}


class ParentOne
{
	public void walk()
	{
		System.out.println("Parent Class method");
	}
}

class Child extends Parent
{
	public void walk()
	{
		System.out.println("Child class method");
	}
}