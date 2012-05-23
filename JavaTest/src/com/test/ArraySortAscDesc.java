package com.test;

public class ArraySortAscDesc {
	public static void main(String[] args)
	{
	int[] numArray={28, 76, 2, 482, 15, 1250, 3200, 9, 720, 164};
	
	for (int i=numArray.length; --i >=0;)
	{
	for (int j=0; j<1; j++)
	{
	if (numArray[j] > numArray[j+1])
	{
	int temp=numArray[j];
	numArray[j]=numArray[j+1];
	numArray[j+1]=temp;
	}
	}
	}
	for (int i=0;i < numArray.length;i++)
	{

	System.out.print(numArray[i]+" ");

	}
	System.out.println();
	}
	} 

