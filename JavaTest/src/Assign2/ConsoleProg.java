package Assign2;

/* 11.	Write a console program to declare and initialize a double variable with some value such as 1234.5678. Then retrieve the integral part of the value and store it in a variable of type long, and the first four digits of the fractional part and store it in an integer of type short. Display the value of the double variable by outputting the two values stored as integers. */

import static java.lang.Math.*;

class DoubleNum
{
	double d;
	String str,s;
	int index;
	long int_part;
	short frac_part;

	DoubleNum(Double d)
	{
		this.d=d;
	}

	void split()
	{
		str=Double.toString(d);
		index=str.indexOf(".");
		int_part=(long)floor(d);
		s=str.substring(index+1);
		frac_part=Short.parseShort(s);
	}
	void display()
	{
		System.out.println("Given no. = "+d);
		System.out.println("integral part = "+int_part);
		System.out.println("factional part = "+frac_part);
	}

}

class SplitNumber
{
	public static void main(String [] args)
	{
		DoubleNumOne duble=new DoubleNumOne(1234.5678);
		duble.split();
		duble.display();
		}
}