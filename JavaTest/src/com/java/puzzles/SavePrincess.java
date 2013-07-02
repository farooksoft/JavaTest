package com.java.puzzles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Traverse through the matrix and print the numbers 
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
		
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
		
		SimpleDateFormat date = new SimpleDateFormat("ddMMyy");
		try {
			Date parsedDate = date.parse("020713");
			System.out.println(parsedDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
//		log.info("Read : " + input);
	}

}