package com.dpattern.creational.builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		MealBuilder builder = new MealBuilder();
		Meal vegBurger = builder.prepareVegBurger();
		vegBurger.showItems();
		System.out.println(vegBurger.getCost()+"\n");		
		
		Meal chickenBurger = builder.prepareChickenBurger();
		chickenBurger.showItems();
		System.out.println(chickenBurger.getCost());		
	}
}
