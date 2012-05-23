package com.test;

public class Average {
	int sum=0;
	double avg(int n)
	{
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is"+sum);
        return(sum/n);
  
  }
	public static void main(String[] args) {
		Average a=new Average();
		double f=a.avg(12);
		System.out.println("average is"+f);
		
	}
}