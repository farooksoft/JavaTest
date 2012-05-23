package com.test.day3;

/**
 * main class can also be Abstract <p>
 * parent abstract methods should be defined in child classes <p> 
 * 
 * @param args
 */
abstract public class AbstractDemo {
	public AbstractDemo(String a) {
		System.out.println("Abstract demo constructor !! "+a);
	}
	public abstract void fly();
	void notFly(){
		System.out.println("I'm NOT flying :( ");
	}
	public static void main(String[] args) {
		new AbstractTwo().notFly();
	}
}
class AbstractTwo extends AbstractDemo{
	public AbstractTwo() {
		super("srinath");
	}
	public void fly(){
		System.out.println("I'm flying........");
	}
}