package com.dpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private int state;
	private List<Observer> observersList = new ArrayList<Observer>();
	
	public int getState() {
		return this.state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer){
		this.observersList.add(observer);
	}

	private void notifyAllObservers() {
		for(Observer observer : this.observersList){
			observer.update();
		}
	}	
}