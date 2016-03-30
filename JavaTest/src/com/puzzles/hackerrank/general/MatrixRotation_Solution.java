package com.puzzles.hackerrank.general;

import java.util.Scanner;

public class MatrixRotation_Solution {

	public static void main(String[] args) {

		/*System.out.println(" ");
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int columns = in.nextInt();
		int rotations = in.nextInt();*/

		int rows = 4;
		int columns = 4;
		int rotations = 1;
		
		//int[][] sourceArray = new int[rows][columns];
		int[][] sourceArray = {	{1,2,3,4}, 
								{5,6,7,8}, 
								{9,10,11,12}, 
								{13, 14, 15, 16}
							  };
		
		/*for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sourceArray[i][j] = in.nextInt();
			}
		}*/
		System.out.println("Given array - ");
		printArray(sourceArray, rows, columns);
		System.out.println("------------------");
		traverseArray(sourceArray, rotations, rows, columns);
		
	}

	private static void traverseArray(int[][] sourceArray, int rotations,
			int rows, int columns) {

		String answer = "";
		int level = 0;
		for (int i = 0; i < rows; i++) {
			answer = "";
			for (int j = 0; j < columns; j++) {

				answer = answer
						+ findRotatedElement(sourceArray, i, j, 0, rotations,
								rows, columns) + " ";

			}
			System.out.println(answer.trim());
		}
	}

	private static int findRotatedElement(int[][] sourceArray, int i, int j,
			int level, int rotations, int arrayRows, int arrayColumns) {

		for (int k = 0; k < rotations; k++) {
			if (i - 1 > 0) {
				i = i - 1;
			} else if (j + 1 <= arrayColumns) {
				j = j + 1;
			} else if (i + 1 <= arrayRows) {
				i = i + 1;
			} else if (j - 1 > 0) {
				j = j - 1;
			}
			System.out.println(i + "-" + j);
		}

		return sourceArray[i][j];
	}

	private static void printArray(int[][] sourceArray, int rows, int columns) {

		String answer = "";

		for (int i = 0; i < sourceArray.length; i++) {
			answer = "";
			for (int j = 0; j < sourceArray[i].length; j++) {
				answer = answer + sourceArray[i][j] + " ";
			}
			System.out.println(answer.trim());
		}

	}

}
