package com.dpattern;

public class MedSpeedState extends State {

	@Override
	void pull(Fan fan) {
		fan.setState(new HighSpeedState());
		System.out.println("High Speed State");
	}
}
