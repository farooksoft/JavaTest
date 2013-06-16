package com.assign.day2;

public class AvgofNnos {
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
		AvgofNnos a=new AvgofNnos();
		double f=a.avg(12);
		System.out.println("average is"+f);
		
	}
}
	