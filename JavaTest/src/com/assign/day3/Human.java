package com.assign.day3;

import java.io.FileInputStream;

public class Human implements Cloneable{
	String name;
	FileInputStream inputStream;
	public Human() {
		try{
			inputStream = new FileInputStream("C:/Srinath_Java_Exercise/AvgofNnos.java");
		}catch(Exception exception){
			System.out.println(exception);
		}
	}
public Object getClone(){ 
	try{
		return super.clone();
	}catch(Exception exception){
		return null;
	}
}
}
