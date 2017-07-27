package com.core.java8.lambda;

import java.util.Arrays;

/**
 * Making hands dirty with Streams
 * 
 * @author srayabar
 *
 */
public class HelloWorldStreams {

	public static void main(String[] args) {
		
		Arrays.asList("abc", "def", "ghi", "ayx").
//		Arrays.asList(new Person("abc",10), new Person("def",9),new Person("ghi",11),new Person("akl",5)).		
		stream().
		filter( s -> s.startsWith("a")).
		map(a -> a.toUpperCase()).
		sorted().
		forEach(System.out :: println);

	}
}

class Person{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}