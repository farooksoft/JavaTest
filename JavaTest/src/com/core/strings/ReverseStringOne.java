package com.core.strings;

import java.io.*;

class ReadStringOne {

	String str;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void reversestr() {
		try {
			System.out.println("enter the string   ");

			str = br.readLine();

			for (int i = str.length() - 1; i >= 0; i--)

				System.out.print(str.charAt(i));
			System.out.println(" ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ReverseStringOne {
	public static void main(String[] v) {

		ReadStringOne r = new ReadStringOne();

		r.reversestr();

	}
}
