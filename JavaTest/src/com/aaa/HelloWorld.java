package com.aaa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class HelloWorld {
	public static void main(String[] args){
		
		//'date':'dd/MM/yyyy','time':'h:mm a'
		
		Calendar instance = GregorianCalendar.getInstance();
		instance.setTimeInMillis(1482175804 * 1000L);
		
		System.out.println(instance.getTime().toString());
	
		String date = new java.text.SimpleDateFormat("dd/MM/yyyy h:mm a").format(new java.util.Date (1482175804 * 1000L));
		
		System.out.println(date);
		
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar calendarEndTime = Calendar.getInstance();
		calendarEndTime.setTimeInMillis(1482175804 * 1000L);
		String format = dateFormat.format(calendarEndTime.getTime());
		System.out.println(format);
		
		
		
		SimpleDateFormat  formatter = new SimpleDateFormat("dd/MM/yyyy h:mm a",Locale.getDefault());
		//set TimeZone to format dates according to current configured TimeZone
		//formatter.setTimeZone();
		Date d = new Date(1482175804 * 1000L);
		String formattedDate = formatter.format(d);
		
		System.out.println(formattedDate);
		
		long unixSeconds = 1482175804;
		Date date1 = new Date(unixSeconds*1000L); // *1000 is to convert seconds to milliseconds
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy h:mm a"); // the format of your date
		sdf.setTimeZone(TimeZone.getTimeZone("America/Indiana/Indianapolis")); // give a timezone reference for formating (see comment at the bottom
		formattedDate = sdf.format(date1);
		System.out.println(formattedDate);
		
		printMe("abc", "def");
		
		printMe("abc");
		
    }
	
	static void printMe(String... string){
		for(String s : string){
			System.out.println(s);
		}
	}
	
	
}