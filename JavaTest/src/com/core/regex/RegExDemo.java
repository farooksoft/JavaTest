package com.core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	/*
	
	^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$

	Explanation:
	^                 # start-of-string
	(?=.*[0-9])       # a digit must occur at least once
	(?=.*[a-z])       # a lower case letter must occur at least once
	(?=.*[A-Z])       # an upper case letter must occur at least once
	(?=.*[@#$%^&+=])  # a special character must occur at least once
	(?=\S+$)          # no whitespace allowed in the entire string
	.{8,}             # anything, at least eight places though
	$                 # end-of-string
	
 	 */
	 
	public static void main(String[] args) {
		RegExDemo exDemo = new RegExDemo();
//		boolean result = exDemo.validate("Srinath7%");
		boolean result = exDemo.validate("aÀ4");
		System.out.println(result);
	}
	
	private Pattern pattern;
	private Matcher matcher;

	private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	private static final String FRENCH_PATTERN = "[a-zÀ-ÿ][A-ZÀ-ÿ][a-zA-ZÀ-ÿ0-9]";
	/*
	 [a-zÀ-ÿ] : for all accent characters including French accents in lowercase only
	 [A-ZÀ-ÿ] : for all accent characters including French accents in uppercase only
	 */
	public RegExDemo() {
//		pattern = Pattern.compile(PASSWORD_PATTERN);
		pattern = Pattern.compile(FRENCH_PATTERN);
	}

	/**
	 * Validate password with regular expression
	 * 
	 * @param password password for validation
	 * @return true valid password, false invalid password
	 */
	public boolean validate(final String password) {
		matcher = pattern.matcher(password);
		return matcher.matches();
	}

}