package com.dpattern;

public class OffState extends State {

	@Override
	void pull(Fan fan) {
		fan.setState(new OnState());
		System.out.println("Switched On");
	}
}
