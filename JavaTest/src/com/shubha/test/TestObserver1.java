package com.shubha.test;

public class TestObserver1 extends Observer{

	TestObserver1(Subject subject){
		this.subject=subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("in observer 1:"+this.subject.getState());
	}

	
}
