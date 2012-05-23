package com.test;
import java.util.Scanner;

public class PrimeNo {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a number");
		int a = s.nextInt();
		boolean isPrime=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				isPrime=false;
				System.out.println(a+" is not prime");
				break;
			}
		else
		continue;
		}
	if(isPrime)	
		System.out.println("its prime");
	}
}
