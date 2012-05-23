package com.test;
/*
 *  
 */
public class First100Prime {
	public static void main(String args[])
	{
		int num=4;
		int count=0;
		System.out.println("First 100 Prime Number is: ");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		while(count<100)
		{
			num++;
			if(num%2!=0)
			{
				int dv=3;
				while((num%dv!=0)&&(dv<=((num-1)/2)))
				{
					dv++;
				}
				if(num%dv!=0)
				{
					count++;
					System.out.print(num+" ");
				}
			}
		}
	}
}