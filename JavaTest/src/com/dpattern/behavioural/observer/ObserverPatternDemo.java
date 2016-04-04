package com.dpattern.behavioural.observer;

/**
 * It's a behaviour pattern - Observer design pattern is based on communicating changes in state of object to observers so that they can take there action. 
 * 
 * http://www.tutorialspoint.com/design_pattern/observer_pattern.htm. 
 * <br> 
 * Idea: Subject class has a state variable and list of Observer classes. Observer is an abstract class which has Subject reference and an update method. 
 * Whenever a subject is passed to TestObserver classes they will be calling that subject attach() method. Later when a subject setStatus() method is called, 
 * it will call notifyObjects() method which will call internally update() method of each TestObserver class to which this Subject reference is passed. 
 * Hence each status change will notify all the Observers
 * 
 * @author srayabar
 */
public class ObserverPatternDemo {
	
	public static void main(String[] args) {
		
		//the one that changes it's state
		Subject subject = new Subject();
		
		//changing the status - but here no impact
		subject.setState(0); //this doesn't have any effect as subject is not attached to a Observer
		
		//adding subject to multiple observers whom will get intimated
		new Test1Observer(subject);
		new Test2Observer(subject);
		new Test3Observer(subject);
		
		//this status change will impact above observers
		subject.setState(1);
	}
}