package com.puzzles;

import java.util.Scanner;

public class ChocolateFeastDemo {

	/*
	 * 2 <= N <= 100000 1 <= C <= N 2 <= M <= N
	 * 
	 * Sample input 3 10 2 5 12 4 4 6 2 2
	 * 
	 * Sample Output 6 3 5
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfLines = Integer.parseInt(scanner.nextLine());
		String[][] inputData = new String[numberOfLines][3];

		for (int i = 0; i < numberOfLines; i++) {
			String[] lineData = scanner.nextLine().split(" ");
			for (int j = 0; j < lineData.length; j++) {
				inputData[i][j] = lineData[j];
			}
		}

		/*
		 * for(int i=0; i< inputData.length; i++){ for(int j=0; j<
		 * inputData[0].length;j++){ System.out.print(inputData[i][j]); }
		 * System.out.println(); }
		 */
		scanner.close();
		// System.out.println("Calculating...");

		for (int i = 0; i < inputData.length; i++) {
			int chocolates = calculateChociis(
					Integer.parseInt(inputData[i][0]),
					Integer.parseInt(inputData[i][1]),
					Integer.parseInt(inputData[i][2]));
			System.out.println(chocolates);
		}
	}

	private static int calculateChociis(int bill, int chociiPrice, int wrappers) {
		int chociis = 0;
		if (chociiPrice == 0 && wrappers == 0) {
			chociis = bill;
		} else if (chociiPrice != 0 && wrappers == 0) {
			chociis = bill / chociiPrice;
		} else if (chociiPrice == 0 && wrappers != 0) {
			chociis = bill + (bill / wrappers);
		} else if (chociiPrice != 0 && wrappers != 0 && chociis <= wrappers) {
			chociis = bill / chociiPrice;
			chociis = chociis
					+ calculateChociis(bill, chociiPrice, chociis / wrappers);
		}
		return chociis;
	}
}