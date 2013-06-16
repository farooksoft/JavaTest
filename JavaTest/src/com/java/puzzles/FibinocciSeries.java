package com.java.puzzles;

import java.util.Scanner;

/**
 * Generates the Fibinocci series for the user entered Number. 
 * @author srinath.rayabarapu
 *	ex : 0 1 1 2 3 5 8 13 21.........n
 */
public class FibinocciSeries {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int iNumber = reader.nextInt();
		
		generateFibinocci(iNumber);
	}

	public static void generateFibinocci(int iNumber) {
		System.out.println("Generating Fibinocci Series for the number : "+iNumber);
		int a, b, c = 0;
		for(int i=0; i < iNumber; i++){
			
		}

	}
	
}
