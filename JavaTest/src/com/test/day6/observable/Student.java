package com.test.day6.observable;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer, Runnable {
	Thread thread;String string;
	public Student(String string) {
		this.string = string;
	}
//	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Student is thinking");
		bhago((String)arg1);
	}
	private void bhago(String string) {
		thread = new Thread(this, string);
		thread.start();
	}
//	@Override
	public void run() {
		try{Thread.sleep(10000);}catch(Exception e){}
		System.out.println("fire fire :Student  running...."+string);
	}
}
