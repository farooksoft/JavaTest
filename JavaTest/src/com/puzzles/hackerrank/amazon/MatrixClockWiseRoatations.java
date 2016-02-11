package com.puzzles.hackerrank.amazon;

import java.util.Scanner;

public class MatrixClockWiseRoatations {

	public static int matrixTraverse(int arr[][], int row, int column) {

		//printing a row left to right
		for (int k = 0; k < column; k++) {
			System.out.print(" " + arr[0][k]);
		}

		//printing last column across all rows
		for (int k = 1; k < row; k++) {
			System.out.print(" " + arr[k][column - 1]);
		}

		//printing last row from right to left
		for (int k = column - 2; k >= 0; k--) {
			System.out.print(" " + arr[row - 1][k]);
		}

		//printing column from bottom row to top
		for (int k = row - 2; k > 0; k--) {
			System.out.print(" " + arr[k][0]);
		}

		// return the program in case we cann't retrieve a matrix
		if ((row - 2) <= 0) {
			return 0;
		}
		
		int[][] newArr = new int[row - 2][column - 2];
		
		for (int i = 1; i < row - 1; i++) {
			for (int j = 1; j < column - 1; j++) {
				newArr[i - 1][j - 1] = arr[i][j];
			}
		}

		row = newArr.length;
		column = newArr[0].length;
		
		// do the same for remaining matrix
		return matrixTraverse(newArr, row, column);
	}

	public static void main(String args[]) {

		int arr[][] = { { 1, 2, 3, 34, 2, 4 }, 
						{ 12, 13, 14, 4,6,7 }, 
						{ 11, 16, 15, 4, 5,8 },
						{ 10, 9, 8, 1, 2, 55 } 
					  };

		System.out.println("Your 2D Array : ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print("\t" + arr[i][j]);
			}
			System.out.println();
		}

		System.out.print("Traverse Circular : \n");

//		matrixTraverse(arr, arr.length, arr[0].length);
		
//		printRotatedElements(arr, arr.length, arr[0].length);
		
		rotatematrix(arr, arr.length, arr[0].length);
		

	}

	private static void printRotatedElements(int[][] arr, int row, int column) {
		
		//printing a row left to right
		for (int k = 0; k < column; k++) {
			System.out.print(" " + arr[0][k]);
		}

		//printing last column across all rows
		for (int k = 1; k < row; k++) {
			System.out.print(" " + arr[k][column - 1]);
		}

		//printing last row from right to left
		for (int k = column - 2; k >= 0; k--) {
			System.out.print(" " + arr[row - 1][k]);
		}

		//printing column from bottom row to top
		for (int k = row - 2; k > 0; k--) {
			System.out.print(" " + arr[k][0]);
		}
		
	}
	
	
	static void rotatematrix(int[][] arr, int rows, int columns)
	{
	    int row = 0, col = 0;
	    int prev, curr;
	 
	    /*
	       row - Staring row index
	       m - ending row index
	       col - starting column index
	       n - ending column index
	       i - iterator
	    */
	    while (row < rows && col < columns)
	    {
	    	
	        if (row + 1 == rows || col + 1 == columns)
	            break;
	 
	        // Store the first element of next row, this
	        // element will replace first element of current
	        // row
	        prev = arr[row + 1][col];
	 
	         /* Move elements of first row from the remaining rows */
	        for (int i = col; i < columns; i++)
	        {
	            curr = arr[row][i];
	            arr[row][i] = prev;
	            prev = curr;
	        }
	        row++;
	 
	        /* Move elements of last column from the remaining columns */
	        for (int i = row; i < rows; i++)
	        {
	            curr = arr[i][columns-1];
	            arr[i][columns-1] = prev;
	            prev = curr;
	        }
	        columns--;
	 
	         /* Move elements of last row from the remaining rows */
	        if (row < rows)
	        {
	            for (int i = columns-1; i >= col; i--)
	            {
	                curr = arr[rows-1][i];
	                arr[rows-1][i] = prev;
	                prev = curr;
	            }
	        }
	        rows--;
	 
	        /* Move elements of first column from the remaining rows */
	        if (col < columns)
	        {
	            for (int i = rows-1; i >= row; i--)
	            {
	                curr = arr[i][col];
	                arr[i][col] = prev;
	                prev = curr;
	            }
	        }
	        col++;
	    }
	    
	    printArray(arr, arr.length, arr[0].length);
	    
	}
	
	private static void printArray(int[][] sourceArray, int rows, int columns) {		
		String answer = "";		
		for(int i=0;i<sourceArray.length;i++){
			answer = "";
			for(int j=0;j<sourceArray[i].length;j++){
				answer = answer + sourceArray[i][j]+" ";				
			}
			System.out.println(answer.trim());
		}		
	}



}