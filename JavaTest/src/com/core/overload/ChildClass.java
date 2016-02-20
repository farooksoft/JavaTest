package com.core.overload;


// overriding : same signatures across base and child classes
// overloading : same method name with different parameters and return type across in base and child classes

class BaseClass {
	
	String baseName;
	
	public Object getBaseName(Object abc) {
		System.out.println("Calling Super name");
		return this.baseName;
	}
	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}
}

public class ChildClass extends BaseClass{
	
	String baseName;
	
	// a overriding method should have compatible return type
	public String getBaseName(String abc) {
		System.out.println("Calling child name");
		return this.baseName;
	}
	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}
	
	public static void main(String[] args) {
		
		ChildClass baseClass = new ChildClass();
		baseClass.getBaseName("abc"); // this prints child name
		
		BaseClass baseClass1 = new ChildClass();
		baseClass1.getBaseName(new String("abc")); // this prints child name
		baseClass1.getBaseName("abc"); // this prints child name
		
		BaseClass baseClass2 = new BaseClass();
		baseClass2.getBaseName(""); // this prints base name
		
		
		
	}
	
}