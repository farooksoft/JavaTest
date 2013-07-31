package Assign1;


/* 2.	Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits separated from one another by three spaces each. Explore the following situations.’
a.	The user enters the correct number of digits.
b.	The user enters more than five digits
c.	The uses enters less than five digits
d.	Explain your answers in each case. */

// the bufferedreader class is available within the io package

import java.io.*;

class FiveDigit {
	public static void main(String v[]) {

		// number,remain, quote and rev are the variables of fiveDigit class
		int number, remain, quot, rev = 0;

		// BufferedReader is a class which is used to accept the information
		// from the keyboard.. br isda BufferedReader object.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// try block is used to find out the error wihtin the statement and
		// throws the error in the form of object.
		try {
			System.out.println("Enter any 5 digit no. ");

			// readLine is a method of BufferedReader class which is used to
			// read the information through the keyboard. Integer.parseInt is
			// used to convert the string into the integer format.
			number = Integer.parseInt(br.readLine());

			// checking the condition whether the entered number is greater than
			// zero or not. if yes continue with the looping, if not cone out of
			// the loop
			while (number > 0) {
				// within this while loop we are reversing the entered number
				// and storing it in an variable called "rev".
				remain = number % 10;
				rev = rev * 10 + remain;
				number = number / 10;
			}

			// ckecking whetehr the rev value is greater than zero or not.if yes
			// then continue with the looping if not come out of looping part.
			while (rev > 0) {
				// here we are seperating the number by three spaces that we
				// have got after reversing using mod and divide operator.
				quot = rev % 10;
				System.out.print(quot + "   ");
				rev = rev / 10;
			}
		}

		// catch block is used to handle the exception which is thrown by the
		// try block in the form of object.
		// IOException is a exception class ioe is an object of type IOException
		catch (IOException ioe) {
		}

	}

}
