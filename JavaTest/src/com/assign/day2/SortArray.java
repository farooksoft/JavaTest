package com.assign.day2;

public class SortArray {
	public static void main(String[] args) {
		int a[]={3,56,8,5,4};
		int s=a.length;
		
		for(int i=0;i<s;i++)
		{
			for(int j=i+1;j<=s-1;j++)
			{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			else
				continue;
		}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
