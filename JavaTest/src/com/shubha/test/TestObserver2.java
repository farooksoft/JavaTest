package com.shubha.test;

public class TestObserver2  extends Observer{

	TestObserver2(Subject subject){
		this.subject=subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("in test obsrver2 : "+ this.subject.getState());
		
	}

}
