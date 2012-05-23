package com.day2.noon;

public class ArrayDemo {
  public static void main(String[] args) {
	
	int []a=new int[3];
	a[0]=10;
	a[1]=12;
	a[2]=15;
	
	/*System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);*/
    //length is property of the array
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	int b[]={12,11,12};
	
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
}
}
