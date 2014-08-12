package com.puzzles.hackerrank.amazon;

import java.util.Scanner;

public class MatrixRoatations {

	public static void main(String[] args) {

		String matrix[][] = new String[5][5];
		System.out.println("Enter the data");
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		// static number as of now
		while (i <= 4) {

			String line = scanner.nextLine();
			String data[] = line.split(" ");

			for (int j = 0; j < data.length; j++) {
				matrix[i][j] = data[j];
			}
			// System.out.println(matrix[i].length);
			i++;
		}

		// Printing the data matrix
		for (int k = 0; k < matrix.length; k++) {
			for (int l = 0; l < matrix[k].length; l++) {
				System.out.print(matrix[k][l] + " ");
			}
			System.out.println("");
		}

		scanner.close();

	}

}