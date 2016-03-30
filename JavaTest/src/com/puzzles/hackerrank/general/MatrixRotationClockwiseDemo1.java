package com.puzzles.hackerrank.general;

import java.util.Scanner;

/**
 * Hacker rank puzzle to rotate a m*n matrix - r rotations - all layers clockwise
 * 
 * @author srayabar
 */
public class MatrixRotationClockwiseDemo1 {

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
		//traverseArray(sourceArray, rotations, rows, columns);
		rotateMatrixClockwise(sourceArray, rotations);
		//printData(sourceArray);
	}

	private static void printData(Data[][] dataArray) {
		int rows = dataArray.length;
		int columns = dataArray[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(dataArray[i][j] + " ");
			}
			System.out.println("");
		}
	}

	private static void rotateMatrixClockwise(int[][] sourceArray, int rotations) {
		Data[][] dataArray = new Data[sourceArray.length][sourceArray[0].length];
		
		for (int i = 0; i < sourceArray.length; i++) {
			for (int j = 0; j < sourceArray[0].length; j++) {
				dataArray[i][j] = new Data(sourceArray[i][j], false);
			}
		}
		
		int rows = dataArray.length;
		int columns = dataArray[0].length;
		
		//for (int i = 0; i < rows; i++) {
			//for (int j = 0; j < columns; j++) {
				int i=0, j=0;
				Data data = dataArray[i][j];
				
				while(!data.isChanged()){ //continous loop
					if(i+1 < rows){
						Data temp = dataArray[i+1][j];
						data.setChanged(true);
						dataArray[i+1][j] = data;
						data = temp;
						i++;
					} else if(j+1 < columns){
						Data temp = dataArray[i][j+1];
						data.setChanged(true);
						dataArray[i][j+1] = data;
						data = temp;
						j++;
					} else if(i-1 > -1){
						Data temp = dataArray[i-1][j];
						data.setChanged(true);
						dataArray[i-1][j] = data;
						data = temp;
						i--;
					} else if(j-1 > -1){
						Data temp = dataArray[i][j-1];
						data.setChanged(true);
						dataArray[i][j-1] = data;
						data = temp;
						j--;
					}
				}
			//}
		//}
		printData(dataArray);
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

class Data{
	private int value;
	private boolean isChanged;
	public Data(int value, boolean isChanged) {
		this.value = value;
		this.isChanged = isChanged;
	}
	public int getValue() {
		return value;
	}
	public boolean isChanged() {
		return isChanged;
	}
	public void setChanged(boolean isChanged) {
		this.isChanged = isChanged;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return this.getValue()+"";
	}
}
