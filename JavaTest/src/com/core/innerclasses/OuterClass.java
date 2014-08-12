package com.core.innerclasses;

public class OuterClass {

	private static String userName = "Admin";
	
	public static void printHelloWorld(){
		userName = "";
		System.out.println("Hello World!!");
	}
	
	
	
	static class InnerClass {
		
		public void printuserName(){
			System.out.println(userName);
		}
		
		public static void main(String[] args) {
			new InnerClass().printuserName();
			
		}
		
	}

}
