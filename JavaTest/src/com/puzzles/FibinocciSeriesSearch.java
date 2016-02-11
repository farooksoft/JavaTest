package com.puzzles;

import java.util.Scanner;

/**
 * Find Fibinocci series and find nth number using Recursion
 * ex : 0 1 1 2 3 5 8 13 21.........n
 * 
 * @author srinath.rayabarapu 
 */
public class FibinocciSeriesSearch {

	static int a = 0, b = 0, c = 0;
	
	public static int findFibinocciSeriesElement(int num) {
		
		if(num == 0 || num == 1){
			return num;
		}
		
		return (findFibinocciSeriesElement(num-1)+findFibinocciSeriesElement(num-2));
	}
	
	public static void main(String[] args) {
		/*Scanner reader = new Scanner(System.in);
		int iNumber = reader.nextInt();*/
//		findFibinocciSeriesElement(iNumber);
		
		System.out.println(findFibinocciSeriesElement(10));
	}
	

}