package com.dpattern.creational.singleton.ex2;

public class LazyInitializationDemo {

}

/**
 * Correct Method 2 : By far - correct Singleton pattern approach
 * 
 * http://howtodoinjava.com/design-patterns/creational/singleton-design-pattern-in-java/#eager_initialization
 * 
 * @author srayabar
 */
class LazySingleton{
	//volatile - will make sure that the variable is available for others only after a thread writes the value full in memory
	//this will avoid probable value corruption in multithreading environment
	private static volatile LazySingleton lazySingleton = null;
	
	//required to block new instances creation
	private LazySingleton() {
	}
	
	public static LazySingleton getInstance(){
		if(lazySingleton != null){
			// required for multi threading
			synchronized (LazySingleton.class) {
				// double checking
				if(lazySingleton != null){
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}