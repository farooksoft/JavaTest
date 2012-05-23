package com.iopack;

import java.io.Serializable;

public class Employee implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;                                                    
}
public void setAge(String age) {
	this.age = age;
}
private String age;

public String toString()
{
	return name+" : " +age;
}

}
