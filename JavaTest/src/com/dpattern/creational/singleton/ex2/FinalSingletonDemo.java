package com.dpattern.creational.singleton.ex2;

import java.io.Serializable;

/**
 * Correct method 1: returning a static object reference from a inner static class
 * 
 * @author srayabar
 */
public class FinalSingletonDemo {
	
}

class IdealSingleton implements Serializable{

	/**
	 * default serial version id
	 */
	private static final long serialVersionUID = 1L;
	
	//required anyway
	private IdealSingleton() {
	}
	
	private static class SingletonHolder{
		public static IdealSingleton singleton = new IdealSingleton();
	}
	
	public static IdealSingleton getInstance(){
		return SingletonHolder.singleton;
	}
	
	protected Object readResolve(){
		return getInstance();
	}
}