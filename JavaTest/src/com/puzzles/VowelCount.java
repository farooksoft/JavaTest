package com.puzzles;

/* 9.	Write an application that reads in a sentence and displays the count of individual vowels in the sentence.*/

import java.io.*;

//java.io package is used for BufferedReader class

class CheckVowels {
	// a_count variable stores the no.of a's occur in the given string
	// e_count variable stores the no.of e's occur in the given string
	// i_count variable stores the no.of i's occur in the given string
	// o_count variable stores the no.of o's occur in the given string
	// u_count variable stores the no.of u's occur in the given string

	int a_count, e_count, i_count, o_count, u_count;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str = null; // string variable initially points to nothing

	CheckVowels() // default constructor used to initialize the instance
					// variables
	{
		super(); // calling the super class constructor
		a_count = 0;
		e_count = 0; // initializing the counter variables
		i_count = 0;
		o_count = 0;
		u_count = 0;
	}

	// this method reads a line of text and it checks each character for vowel
	void readString() {
		System.out.println("Enter a line of text  ");
		try // readLine() method throws IOException so it should be written in
			// try,catch
		{
			str = br.readLine(); // reads a line of text
		} catch (IOException ioe) {
		} // exception is handled

		// the below loop iterates from the first character to the end of the
		// string

		for (int i = 0; i < str.length(); i++) // str.length gets the no.of
												// characters in the string
												// object
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') // checks if the
																// character is
																// 'a' or 'A'
				a_count++; // if the character is a or A increment a_count
							// variable
			if (str.charAt(i) == 'e' || str.charAt(i) == 'E')
				e_count++; // if the character is e or E increment e_count
							// variable
			if (str.charAt(i) == 'i' || str.charAt(i) == 'I')
				i_count++; // if the character is i or I increment i_count
							// variable
			if (str.charAt(i) == 'o' || str.charAt(i) == 'O')
				o_count++; // if the character is o or O increment o_count
							// variable
			if (str.charAt(i) == 'u' || str.charAt(i) == 'U')
				u_count++; // if the character is u or U increment u_count
							// variable
		}
	}

	void showCount() // method to display the no.of times a particular vowel
						// occurs
	{
		System.out.println("No.of a's	:	" + a_count);
		System.out.println("No.of e's	:	" + e_count);
		System.out.println("No.of i's	:	" + i_count);
		System.out.println("No.of o's	:	" + o_count);
		System.out.println("No.of u's	:	" + u_count);
	}
}

class VowelCount {
	public static void main(String[] args) {
		CheckVowels chk = new CheckVowels(); // creating an instance of
												// CheckVowels class

		// readString method called by using object chk
		chk.readString();
		// showCount method called by using object chk
		chk.showCount();
	}
}
