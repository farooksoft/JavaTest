package com.dpattern.creational.singleton.ex2;

public class EagerInitializationDemo {
	
}

/**
	This method works fine, but has one drawback. Instance is created irrespective of it is required in runtime or not. 
	If this instance is not big object and you can live with it being unused, this is best approach.
 * 
 * @author srayabar
 */
class EagerSingleton{
	
	private static EagerSingleton singleton = new EagerSingleton();
	
	//cann't create an object by any class but not a class loader
	private EagerSingleton() {
	}
	
	public static EagerSingleton getInstance(){
		return singleton;
	}
}
