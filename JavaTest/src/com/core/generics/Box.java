package com.core.generics;

import org.hamcrest.core.IsInstanceOf;

/**
 * generic version of Box class
 * 
	E - Element (used extensively by the Java Collections Framework)
	K - Key
	N - Number
	T - Type
	V - Value
	S,U,V etc. - 2nd, 3rd, 4th types
 *  
 * @author srayabar
 *
 * @param <T>
 */
public class Box<T> {
	
	private T t;
	
	public T getT() {
		
		if(this.t instanceof String) {
			// logic related to String
		}
		
		return this.t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		
	}
}
