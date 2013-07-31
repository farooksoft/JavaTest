package Assign2;

/* programme to check two strings str1==str2 and str1.equals(str2) are true and the reverse may not be necessarily true */

// StringTest is the class name

class StringTest
{
	// Execution starts from here

	public static void main(String []arg)
	{
		// str1 , str2 ,str3 are the string variables.
		String str1="hi";
		String str2="hi";
		String str3=new String("hi");

//comparing the string variables str1 and str2 which point to the same memory location

		if(str1==str2)
		System.out.println("both are equal");
		else
		System.out.println("both are not equal");

//comparing the values of the string variables str1 and str2

		if(str1.equals(str2))
		System.out.println("both are Same");
		else
		System.out.println("not equal");

// comparing the string variables str1 and str3 which are pointing to different memory location
		if(str3==str1)
		System.out.println("SAME");
		else
		System.out.println("NOT SAME");

//comparing the values of the string variables str1 and str3
		if(str3.equals(str1))
		System.out.println("Both strings are same");
		else
		System.out.println("Both are not same");

	}
}


