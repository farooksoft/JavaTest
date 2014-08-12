package com.core.strings;

/** programme to check two strings str1==str2 and str1.equals(str2) are true 
 * and the reverse may not be necessarily true 
 */
public class StringDemo {

	public static void main(String[] arg) {
		
		//testname();
		
		System.out.println(Integer.parseInt((" 01").trim()));
		
		
	}

	private void printHashCode(String str1, String str2) {
		System.out.println("str1 hashcod:"+str1.hashCode());
		System.out.println("str2 hashcod:"+str2.hashCode());
	}
	
	public static void testname() {
		

		// str1 , str2 ,str3 are the string variables.
		String str1 = "hi";
		String str2 = "hi";
		StringDemo stringDemo = new StringDemo();
		
		stringDemo.printHashCode(str1, str2);
		
		String str3 = new String("hi");

		// comparing the string variables str1 and str2 which point to the same
		// memory location

		if (str1 == str2)
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");

		// comparing the values of the string variables str1 and str2

		if (str1.equals(str2))
			System.out.println("both are Same");
		else
			System.out.println("not equal");

		// comparing the string variables str1 and str3 which are pointing to
		// different memory location
		if (str3 == str1)
			System.out.println("SAME");
		else
			System.out.println("NOT SAME");

		// comparing the values of the string variables str1 and str3
		if (str3.equals(str1))
			System.out.println("Both strings are same");
		else
			System.out.println("Both are not same");
		
	}
}