package com.dpattern;

public class OnState extends State {

	@Override
	void pull(Fan fan) {
		fan.setState(new LowSpeedState());
		System.out.println("Low Speed State");
	}
}
