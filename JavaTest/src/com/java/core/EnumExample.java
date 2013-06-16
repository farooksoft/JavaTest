package com.java.core;

public class EnumExample {
	
	Day day;
	
	public EnumExample(Day day) {
		this.day = day;
	}
	
	public void tellItLikeThis(){
		
		switch(day){
		
		case MONDAY:
			System.out.println("Its Monday");
			break;
		
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		
		default:
			System.out.println("The other day");
			break;
		
		}
	}
	
	public static void main(String[] args) {
		EnumExample example1 = new EnumExample(Day.TUESDAY);
		example1.tellItLikeThis();
		
		EnumExample example2 = new EnumExample(Day.THURSDAY);
		example2.tellItLikeThis();
	}
	
}