package com.test.day4.fan;

public class HighSpeedState extends State {

	@Override
	void pull(Fan fan) {
		fan.setState(new OffState());
		System.out.println("Switch Off");
	}
}
