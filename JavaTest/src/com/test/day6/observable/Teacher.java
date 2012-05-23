package com.test.day6.observable;
//
import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer,Runnable{
	String string;
	public Teacher(String name) {
		this.string = name;
	}
//	@Override
	public void update(Observable arg0, Object arg1) {
		bhago((String)arg1);
	}
	private void bhago(String string) {
		Thread thread = new Thread(this);
		thread.start();
	}
//	@Override
	public void run() {
		System.out.println("fire fire :Teacher running...."+string);
	}
}
