package com.day2.noon;

public class UnEvenmulti {
  public static void main(String[] args) {
	int a[][]=new int[2][];
	
	a[0]=new int[1];
	a[1]=new int[3];
	for(int i=0;i<a.length;i++)
	{
		for(int j = 0;j<a[i].length;j++)
		{
			System.out.println(a[i][j]);
		}
	 }
}
}
