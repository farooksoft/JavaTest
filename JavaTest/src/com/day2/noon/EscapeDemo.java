package com.day2.noon;

public class EscapeDemo {
 public static void main(String[] args) {
	System.out.println("jack and jill went up the \"hill\" ");
	for(int i=0;i<1000000;i++)
	{
		System.out.print(i+"\b");
	}
}
}
