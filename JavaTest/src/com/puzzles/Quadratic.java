package com.puzzles;

/* This program evaluates the quadratic equation and displays the solutions i.e. the root values 
 */

import java.io.*;

class Quadratic {
	public static void main(String ar[]) {
		// br is an instance of BufferedReader class
		// it is used to take input from the keyboard at runtime
		// it takes an object of InputStreamReader class as parameter
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// a,b,c are variables to store coefficient values
		int a, b, c;
		int disc;
		// x1 and x2 store the result of the two solutions
		double root1, root2;
		System.out.println("Enter a,b and c values  ");
		// try is needed as readLine() method throws IOException
		try {
			// parseInt method converts the string data into integer type data
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			c = Integer.parseInt(br.readLine());
			disc = (b * b) - (4 * a * c);
			if (disc > 0) {
				root1 = (-b - Math.sqrt(disc)) / (2 * a);
				root2 = (-b + Math.sqrt(disc)) / (2 * a);
				System.out.println("roots are real and distinct");
				System.out.println("root1:" + root1 + " " + "root2:" + root2);
			}
			else if (disc < 0) {
				System.out.println("roots are imaginary");
			}
			else {
				root1 = -b / 2 * a;
				root2 = -b / 2 * a;
				System.out.println("root1:" + root1 + "  " + "root2:" + root2);
				System.out.println("roots are real and equal");
			}
		} // end of try block
		catch (IOException ioe) {
			//
		}
	} // end of main() method
} // end of the class definition