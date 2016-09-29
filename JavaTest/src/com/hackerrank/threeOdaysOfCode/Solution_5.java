package com.hackerrank.threeOdaysOfCode;

import java.util.Scanner;

public class Solution_5 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        
        print(arr);
        
        for(int i=0; i<arr.length-2; i++){
        	for(int j=0; j<arr[i].length-2; j++){
				
        		
        		
			}
        }
        
    }

	private static void print(int[][] arr) {
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
    
}