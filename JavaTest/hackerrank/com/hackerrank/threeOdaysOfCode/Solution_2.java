package com.hackerrank.threeOdaysOfCode;

//import java.util.Scanner;

public class Solution_2 {
	
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
      double mealCost = scan.nextDouble(); // original meal price
      int tipPercent = scan.nextInt(); // tip percentage
      int taxPercent = scan.nextInt(); // tax percentage
      scan.close();
		*/
		
      // Write your calculation code here.
      float tip = 12 * (float)20/100;
      float tax = 12 * (float)8/100;
      
      System.out.println(tip);
      System.out.println(tax);
      
      // cast the result of the rounding operation to an int and save it as totalCost 
      int totalCost = (int) Math.round(12.0 + tip + tax);

      // Print your result
      System.out.println("The total meal cost is "+totalCost+" dollars.");
	}
	
}
