package com.java.puzzles;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Traverse through the matrix and print the numbers 
 * 
 * Input : 
 * 1**
 * *2*
 * **3
 * Output: 123
 * 
 * @author srinath.rayabarapu
 */
public class SavePrincess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(SavePrincess.class);
		
		log.info("Please enter Input ::");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		log.info("Read : " + input);
	}

}
