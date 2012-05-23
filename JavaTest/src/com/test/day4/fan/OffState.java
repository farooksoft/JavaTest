package com.test.day4.fan;

public class OffState extends State {

	@Override
	void pull(Fan fan) {
		fan.setState(new OnState());
		System.out.println("Switched On");
	}
}
