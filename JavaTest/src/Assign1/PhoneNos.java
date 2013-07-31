package Assign1;

/* 8.	Write an application that inputs a telephone number as a string in the form (555) 555 – 5555. The program should use an object of class StringTokenizer to extract the area code as a token, the first three digits of the phone number as token and the last four digits of the phone number as a token. The seven digits of the phone number should be concatenated into one string. The program should convert the area code string to int (use parseInt) and the convert the phone number string to long. Both the area code and the phone number should be printed. Remember that you will have to change delimiter character during tokenization process. */

import java.util.*;
import java.io.*;

class PhoneNos {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str_phone_no;
		String numbs[] = { "", "", "", "" };
		StringTokenizer token;
		int len, i, area_code;
		long long_phone_no;

		try {
			System.out
					.println("Enter phone number in the format: (555) 555 - 5555 ");
			str_phone_no = br.readLine();
			token = new StringTokenizer(str_phone_no);
			i = 0;
			while (token.hasMoreTokens()) {

				numbs[i] = token.nextToken();

				if (numbs[i].equals("-"))
					numbs[i] = "*";
				i++;

			}
			len = i;

			long_phone_no = Long.parseLong(numbs[1] + numbs[3]);

			area_code = Integer.parseInt(numbs[0].substring(1, 4));

			System.out.println(" ");

			for (i = 0; i < len; i++)
				System.out.println("numbs[" + i + "]  = " + numbs[i]);

			System.out.print("String format :  ");
			for (i = 0; i < len; i++)
				System.out.print(numbs[i] + " ");
			System.out.println("\n\nArea code  : " + area_code);
			System.out.println("\nPhone No. : " + long_phone_no);
		} catch (Exception e) {
		}
	}
}
