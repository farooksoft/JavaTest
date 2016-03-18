package com.dpattern.singleton.ex1;

import javax.management.RuntimeErrorException;

/**
 * Singleton Design pattern class demo
 * 
 * @author srayabar
 *
 */
public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
	}
}

/**
 * intend to have one and only one instance of any class- very common solution
 * 
 * Look for ex2 package for different approaches
 *  
 * @author srayabar
 *
 */
class Singleton {
	
	//private static Singleton singleton = new Singleton(); // eager approach - not suggested
	private static Singleton singleton = null;
	
	//private constructor methods will only be called by class loader
	private Singleton(){
		if(singleton != null){
			throw new RuntimeErrorException(null, "Can not create a new instance, please call getInstance() method"); // this avoids to create instance thru Reflection
		}
		System.out.println("Creating..");
	}
	
	//only global point of access
	public static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton(); //lazy approach
		}
		return singleton;
	}
	
}