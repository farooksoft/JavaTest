package com.assign.day2;

import java.util.Scanner;

public class NumbForExcep {
	
		public static void main(String[] args)
		{
			int[] marks = new int[5];
			System.out.println("Enter Marks for 5 Students");

				for(int i=0;i<5; i++){
					askUserInput(marks, i);
				}

			int average = 0;
			for(int i=0;i<5; i++){
				average = average + marks[i];
			}
			System.out.println("Average Marks for 5 Students is "+average/5);
		}

		/**
		 * @param marks
		 * @param i
		 */
		private static void askUserInput(int[] marks, int i) {
			Scanner scanner = new Scanner(System.in);
			try{
			marks[i] = Integer.parseInt(scanner.next());
			}
			catch(NumberFormatException exception){
				System.out.println("Enter numbers only, please re-enter");
			}
		}

	}


