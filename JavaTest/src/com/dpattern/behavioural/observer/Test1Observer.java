package com.dpattern.behavioural.observer;

public class Test1Observer extends Observer{

	public Test1Observer(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Test1Observer is updated with.."+this.subject.getState());
	}
}
