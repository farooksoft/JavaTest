package com.core.immutability;

/**
 * Points:
 * 1. Make class final
 * 2. Make all the fields 'private' and 'final'
 * 3. Don't provide any methods that changes the status of fields
 * 
 * 
 * @author srayabar
 *
 */
public final class MyImmutable {

	private final String className;
	private final String classType;
	
	public MyImmutable(String name, String type) {
		this.className = name;
		this.classType = type;
	}
	
	public String getClassName() {
		return this.className;
	}
	
	public String getClassType() {
		return this.classType;
	}
	
	@Override
	public String toString() {
		return "className :" + this.className + ",classType :" + this.classType;
	}
}
