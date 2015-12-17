package com.dpattern.behavioural.observer;

public class Test3Observer extends Observer{

	public Test3Observer(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Test3Observer is updated with.."+this.subject.getState());
	}
}
