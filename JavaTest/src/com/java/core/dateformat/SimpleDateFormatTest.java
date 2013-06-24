package com.java.core.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		String value = "01-04-1989";
		
		String dateFormatString = "yyyy-MM-dd";
		SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatString);
		try {
		System.out.println("Result: " + dateFormat.format(dateFormat.parse(value)));
		} catch (ParseException e) {
		System.out.println("Error date parsing: " + value + " in format " +
		dateFormatString);
		e.printStackTrace();
		}

	}
}
