package com.dpattern.behavioural.observer;

/**
 * It's a behaviour pattern
 * 
 * http://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 * 
 * @author srayabar
 */
public class ObserverPatternMain {
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		subject.setState(0); //this doesn't have any effect as subject is not attached to a Observer
		
		new Test1Observer(subject);
		new Test2Observer(subject);
		new Test3Observer(subject);
		
		subject.setState(1);
	}
}