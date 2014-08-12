package com.dpattern;

public class LowSpeedState extends State {

	@Override
	void pull(Fan fan) {
		fan.setState(new MedSpeedState());
		System.out.println("Medium Speed State");
	}
}
