package com.day2.noon;

public class TwoDimension {
 public static void main(String[] args) {
	//from right handside 1st one is column
	 int a[][]=new int[2][3];
	 a[0][0]=100;
	 a[0][1]=200;
	 a[0][2]=300;
	 a[1][0]=400;
	 a[1][1]=500;
	 a[1][2]=600;
    
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[i].length;j++)
		 {
			 System.out.println(a[i][j] +"\t");
			  }
		 System.out.println();
	   }
 }
 }

