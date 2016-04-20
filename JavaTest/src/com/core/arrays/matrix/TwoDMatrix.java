package com.core.arrays.matrix;

public class TwoDMatrix {
	
	public static void main(String[] args) {
		
		//print 
		/*
		 * 1 2 3 4
		 * 5 6 7 8
		 * 9 10 11 12
		 * 13 14 15 16 
		 * 
		 */
		/*
		for(int i=1; i<=16; i++){			
			System.out.print(i+" ");			
			if(i%4 ==0)
				System.out.print("\n");			
		}
		*/
		
		int[] singleDArray = new int[222];
		
		
		int[] array1 = {12, 32,43,54,5,6,7,8,9};
		//2 dimentional array of 3*3
		
		int[][] twoDArray = new int[3][3];

		//single d array printing
		//for(int i =0;i<array1.length;i++){
		
			int index = 0;
			
			for(int j=0;j<twoDArray.length; j++){			
				for(int k=0;k<twoDArray[j].length;k++){					
					twoDArray[j][k] = array1[index];
					index++;
				}
			}
			
		//}
		
		// reading
		for(int i=0;i<twoDArray.length; i++){			
			for(int j=0;j<twoDArray[i].length;j++){
				System.out.print(twoDArray[i][j]+" ");				
			}
			System.out.print("\n");
		}
		
	}

}