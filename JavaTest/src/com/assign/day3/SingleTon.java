package com.assign.day3;

public class SingleTon {
	static SingleTon singleTon;
	private SingleTon() {
		System.out.println("Single Ton called !");
	}
	public static SingleTon getSingleTon(){
		if(singleTon == null){
			singleTon =  new SingleTon();
			return singleTon;
		}
		else
			return singleTon;
	}
}
