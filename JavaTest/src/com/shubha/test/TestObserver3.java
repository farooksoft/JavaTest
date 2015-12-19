package com.shubha.test;

public class TestObserver3 extends Observer {

	TestObserver3(Subject subject){
		this.subject=subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("in test obsrver3: "+this.subject.getState());
		
	}
	

}
