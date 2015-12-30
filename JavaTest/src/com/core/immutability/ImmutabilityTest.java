package com.core.immutability;

public class ImmutabilityTest {
	
	public static void main(String[] args) {
		MyImmutable immutable1 = new MyImmutable("one", "type1");
		MyImmutable immutable2 = new MyImmutable("two", "type2");
		
		//these two objects cann't be modified once they created
		
		String className = immutable1.getClassName();
		className = "";
		
		System.out.println(immutable1.toString());
		System.out.println("classname :" + className);
	}
	
}
