package com.assignment.day2;

public class Rectangular {
  public static void main(String[] args) {
	  int a[][]={{1},{2,3},{4,5,6},{7,8,9,10}};
	  for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 System.out.print(a[i][j]);
				 System.out.print("\t");			 
				  }
			 System.out.println("\t");
		   }
}
}
