package com.dpattern.observable;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

	public Teacher(String string) {
		// TODO Auto-generated constructor stub
	}

	// @Override
	public void update(Observable arg0, Object arg1) {
		challo((String) arg1);
	}

	public void challo(String msg) {
		System.out.println("student is running" + msg);
	}
}
