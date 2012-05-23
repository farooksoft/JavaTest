package com.test;

public class Accessdemo {
	int i;
	int j;
	public int p;
	protected int k;
	void display()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(p);
		System.out.println(k);
	}

}
 class subDemo extends Accessdemo
{
	 void display()
		{
			System.out.println(i);
			System.out.println(j);
			System.out.println(p);
			System.out.println(k);
		}
}
 class nonsub
 {
	 Accessdemo a=new Accessdemo();
	
	 void print()
	 {
		 System.out.println(a.j);
	 }
	 
			
		
 }