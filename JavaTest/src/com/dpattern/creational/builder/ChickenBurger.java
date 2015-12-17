package com.dpattern.creational.builder;

public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public int price() {
		return 10;
	}
	
}
