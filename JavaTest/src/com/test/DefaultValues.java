package com.test;

public class DefaultValues {
		int i;
		long l;
		byte b;
		short s;
		float f;
		double d;
		char c;
		String st;
		void print()
		{
			System.out.println("int:"+i);
			System.out.println("long"+l);
			System.out.println("byte"+b);
			System.out.println("short:"+s);
			System.out.println("float"+f);
			System.out.println("double"+d);
			System.out.println("char"+c);
			System.out.println("String"+st);
			
		}
		
		public static void main(String a[])
		{
			DefaultValues s=new DefaultValues();
			
			s.print();
			//System.out.println("hello world");
			}
	}



