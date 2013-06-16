package com.java.core;

public class ADeadLock {
	
	synchronized void foo(BDeadLock bDeadLock){
		String name = Thread.currentThread().getName();
		System.out.println(name+" entered ADeadLock.foo()");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("ADeadLock interrupted");
		}
		System.out.println(name +" trying to call BDeadLock.last()");
		bDeadLock.last();
	}
	
	synchronized void last(){
		System.out.println("Inside ADeadLock.last()");
	}

}