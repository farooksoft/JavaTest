package com.core.strings;

/*7.	Write a method that reads a sentence and prints out the sentence in reverse order. For example the method will display

 ?uoy era who for the input How are you ? */

import java.io.*;

//ReadString is a class that has reversestr method which is used to reverse the given string

class ReadStringOne {
	// str is a String variable

	String str;

	// BufferedReader is used to accept the input from the keyboard

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void reversestr() {
		try {
			System.out.println("enter the string   ");

			// readLine() is used to read a line of text from the keyboard

			str = br.readLine();

			// Here we are finding the length of the string and the loop
			// iterates based on the condition

			for (int i = str.length() - 1; i >= 0; i--)

				// charAt() method returns a character from the specified
				// location.

				System.out.print(str.charAt(i));
			System.out.println(" ");

		} catch (Exception e) {
		}
	}
}

class ReverseStringOne {
	public static void main(String[] v) {

		// creating the instance of the class ReadString

		ReadStringOne r = new ReadStringOne();

		// using the ReadString object the reversestr method is called

		r.reversestr();

	}
}
