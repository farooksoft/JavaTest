package com.core.dateformat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * TimeZone timezone = TimeZone.getTimeZone("Europe/Paris");
		 * 
		 * Date date = new Date(); // your date Calendar cal =
		 * Calendar.getInstance(timezone);
		 * 
		 * Calendar calendar =
		 * Calendar.getInstance(TimeZone.getTimeZone("Europe/Madrid")); Date
		 * currentDate = calendar.getTime();
		 * 
		 * System.out.println(currentDate);
		 */
		DateFormat df = DateFormat.getDateInstance(DateFormat.DATE_FIELD,
				Locale.FRANCE);

		Date date = new Date(new Long("1386898984141"));
		// System.out.println(df.format(date));
		System.out.println(date);

		// 1386056624141
		// Tue Dec 03 13:13:44 IST 2013

		/*
		 * DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 * 
		 * // Use Madrid's time zone to format the date in
		 * df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
		 * 
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss Z");
		 * 
		 * System.out.println("Date and time in Madrid: " + df.format(date));
		 */
	}

}
