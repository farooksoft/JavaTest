package com.test.day6.observable;

import java.util.Observable;

public class FireAlarm extends Observable{
	
	public void fireAlram(){
		setChanged();
		notifyObservers("Fire in Valtech");
	}
}
