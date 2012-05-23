package com.day2.noon;

public class VariableDemo3 {
   int i=257;
   byte b;
   boolean br;
   String s="abcdef";
   String s1=new String("abcdef");
   char c='a';
   boolean bool=true;
   
   public static void main(String[] args) {
	VariableDemo3 obj1=new VariableDemo3();
	/*obj1.br=(boolean)obj1.i;
	System.out.println(obj1.br);*/
	obj1.i=(byte)obj1.b;
}
}
