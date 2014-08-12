package com.dpattern.businessdelegate;

public class DummyCounter implements ServiceCounter {
	public void execute() {
		System.out.println("Counter is Under construction ");
		System.out.println("come after 1 week");
	}
}
