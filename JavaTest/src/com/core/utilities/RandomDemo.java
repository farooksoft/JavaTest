package com.core.utilities;

import java.util.Random;

/**
 * generates random number within given range
 * 
 * @author Sreekanth
 */
public class RandomDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();

		// with range
		int num = random.nextInt(10);
		System.out.println("Generated numbers are : " + num);

		// without range
		int numNoRange = random.nextInt();
		System.out.println("Generated numbers without range : " + numNoRange);
	}
}
