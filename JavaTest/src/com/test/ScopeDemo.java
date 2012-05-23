package com.test;

public class ScopeDemo {
	int i=10;
	static int j=20;
	void display()
	{
		int k=30;
		System.out.println(i+" "+j+" "+k);
		
	}
public static void main(String[] args) {
	ScopeDemo s=new ScopeDemo();
	s.display();
}
}
