package Assign2;

/* This program evaluates the compound interest, given the principal amount, interest rate and no.of years and atlast display the amount after n years */

import java.io.*;
class CompoundInt{

	public static void main(String ar[]){

//br is an instance of BufferedReader class
//it is used to take input from the keyboard at runtime
//it takes an object of InputStreamReader class as parameter

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

// principal_amount,interest_rate,no_of_years are variables to store principal,interest and no.of years
		int principal_amount,no_of_years;

		//compound_int stores the result of the compound interest
		double compound_int,interest_rate;

		// try is needed as readLine() method throws IOException
		try{
		System.out.println("Enter Principal amount  ");

		principal_amount=Integer.parseInt(br.readLine());
		//parseInt method converts the string data into integer type data

		System.out.println("Enter interest rate  ");
		interest_rate=Float.parseFloat(br.readLine());

		System.out.println("Enter no.of years  ");
		no_of_years=Integer.parseInt(br.readLine());

		compound_int=principal_amount*(1-Math.pow(interest_rate/100,no_of_years+1))/(1-(interest_rate/100));
		System.out.println("Compound interest is "+compound_int);

	}   //end of try block
	catch(IOException ioe){}
}  //end of main() method
} //end of the class definition

