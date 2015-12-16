package com.dpattern.observer;

public class Test2Observer extends Observer{

	public Test2Observer(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Test2Observer is updated with.."+this.subject.getState());
	}
}
