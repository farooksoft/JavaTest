package com.dpattern.creational.singleton.ex2;

import java.io.Serializable;

public class FinalSingletonDemo {

}

class IdealSingleton implements Serializable{

	/**
	 * default
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