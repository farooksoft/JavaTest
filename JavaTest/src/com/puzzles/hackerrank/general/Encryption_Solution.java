package com.puzzles.hackerrank.general;

import java.util.Scanner;

public class Encryption_Solution {
	
	 public static void main(String[] args) {
		 
	     Scanner in = new Scanner(System.in);
	     String s = in.next().trim();
	     
		 int length = s.length();
		 
		 Double sqrt = Math.sqrt(length);
		 
		 int rows = (int)Math.floor(sqrt);		 
		 int columns = (int)Math.ceil(sqrt);
		 
		 if(length > (columns * rows)){
			 rows = columns;
		 }
		 
		 int index = 0;
		 
		 String[][] array = new String[rows][columns];
		 
		 for(int i=0;i<rows;i++){
			 for(int j=0;j<columns;j++){
				 if(index < length){
					 array[i][j] = s.charAt(index)+"";
					 index ++;
				 }
			 }
		 }
		 
		 String answer = "";			
		 for(int i=0;i<columns;i++){
			 for(int j=0;j<rows;j++){					 
				 answer = answer + ((array[j][i] == null) ? "" : array[j][i]);					 					 
			 }
			 answer = answer + " ";
		 }
		 
		 System.out.println(answer.trim());
		 
		 in.close();
	 }
}