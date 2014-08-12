package com.core.strings;

public class Stringexample {
	public static void main(String[] args) {
		
		/*String s1 = "krishna  ";
		String s2 = new String("krishna chaitanya ");
		System.out.println("s1 is" + s1 + s1.hashCode());
		System.out.println(s1.concat("asdd") + s1.hashCode());
		System.out.println(s1);
		System.out.println(s1.substring(3, 9));
		System.out.println(s1.getBytes());
		System.out.println(s1.trim());
		System.out.println(s1.compareTo(s2));*/
		
		
		String string = "<p>HiHi";
		string = string.substring(string.indexOf(">")+1, string.length());
		System.out.println(string);
		
		
		
	}
}
