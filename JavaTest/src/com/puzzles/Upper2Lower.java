package com.puzzles;

/* Write an application that reads a sentence and prints out the sentence with all upper case letters changed 
 * to lowercase and all lower case letters changed to uppercase
 */
import static java.lang.Character.*;
import java.io.*;

class Convert {
	void uppercase(String str) {
		int i;

		for (i = 0; i < str.length(); i++) {

			if ((isWhitespace(str.charAt(i)) == true))
				System.out.print(" ");

			if ((isUpperCase(str.charAt(i)) == true))
				System.out.print(toLowerCase(str.charAt(i)));

			if ((isLowerCase(str.charAt(i)) == true))
				System.out.print(toUpperCase(str.charAt(i)));
		}
	}

}

public class Upper2Lower {
	public static void main(String[] a) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = null;
		Convert con = new Convert();
		System.out.println("Enter any String  ");
		try

		{
			st = br.readLine();
			// String st="Welcome To Java World";
		} catch (IOException ioe) {
			//
		}
		System.out.println("Actual string     : " + st);

		System.out.print("\nConverted String  :");

		con.uppercase(st);

		System.out.println();
	}

}