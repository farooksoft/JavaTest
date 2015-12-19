package com.shubha.test;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private int state;
	private List<Observer> observerList = new ArrayList<Observer>();
	
	
	public void attach(Observer observer){
		observerList.add(observer);
		
	}
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}
	private void notifyObservers() {
		for(Observer ob: observerList){
			ob.update();
		}
		
	}
}
