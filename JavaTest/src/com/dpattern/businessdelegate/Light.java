package com.dpattern.businessdelegate;

public class Light implements Switch {
	public void on() {
		System.out.println("Light On !!");
	}

	public void off() {
		System.out.println("Light Off !!");
	}
}
