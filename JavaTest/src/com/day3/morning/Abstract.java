package com.day3.morning;

public abstract class Abstract {
 public Abstract()
  {
	 System.out.println("abstract constructor called...");
   }
 
 public abstract void fly();
 public void nofly()
  {
	 System.out.println("no fly method is called");
  }
 public static void main(String[] args) {
	AbstractChild ac=new AbstractChild();
	ac.nofly();
 } 
}

abstract class AbstractOther extends Abstract
{
  public void display()
  {
	  System.out.println("in abstract other class");
  }
}

class AbstractChild extends Abstract
{
	public void fly()
	{
	 System.out.println("fly method is called");
     }
}	

