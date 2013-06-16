package com.assign.day2;


public class DefaultValues {

      int i;
	  long l;
	  char c;
	  byte b;
	  short s;
	  float f;
	  double d;
	  boolean t;
	  String str;
	  public void printVariables()
	  {
		  System.out.println("integer" +i);
		  System.out.println("long:" +l);
		  System.out.println("character:" +c);
		  System.out.println("byte:" +b);
		  System.out.println("short:" +s);
		  System.out.println("float:" +f);
		  System.out.println("double:" +d);
		  System.out.println("boolean:" +t);
		  System.out.println("string:" +str);
		 }
		public static void main(String[] args) 
		{
			DefaultValues obj=new DefaultValues();
			
			obj.printVariables();
	      }
	}


