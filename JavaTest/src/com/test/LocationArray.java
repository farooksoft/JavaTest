package com.test;

public class LocationArray {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a[]={1,2,3,4,5,6,7,8,9};
		for(int i=0;i<(a.length-1);i++)
		{
			if(n==a[i])
			System.out.println("elementfound at"+(i+1)+"position");
		}
	}
}
