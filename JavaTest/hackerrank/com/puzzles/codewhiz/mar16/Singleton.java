package com.puzzles.codewhiz.mar16;

public class Singleton {
	
	public String str;
	private static Singleton singleton;
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance(){
		
		if(singleton == null){
			synchronized (Singleton.class) {
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
