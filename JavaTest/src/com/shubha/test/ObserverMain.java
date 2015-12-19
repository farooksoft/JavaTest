package com.shubha.test;

public class ObserverMain {

	public static void main(String[] args) {
		Subject sub = new Subject();
		new TestObserver1(sub);
		new TestObserver2(sub);
		new TestObserver3(sub);
		
		sub.setState(1);
		sub.setState(5);
	}
}
