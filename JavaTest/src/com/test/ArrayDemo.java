package com.test;

public class ArrayDemo {
	public static void main(String[] args) {
		int []a=new int[3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		a[0]=1;
		a[1]=2;
		a[2]=3;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
