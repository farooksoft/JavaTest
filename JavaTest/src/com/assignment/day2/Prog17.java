package com.assignment.day2;

public class Prog17 {
	protected  int  c=10;
	protected static int s;
	public void nonStatMethod()
	{
		s=30;
		System.out.println("static member value is"+s);
		c=46;
		System.out.println("constant value is:"+c);
	}
	 

public static void main(String[] args) {
	
	 new Prog17().nonStatMethod();
	 //con obj=new con();//con(n) is undefined
}
}
