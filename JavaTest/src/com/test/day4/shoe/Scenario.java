package com.test.day4.shoe;

public class Scenario {
	
	public static void main(String[] args) {
			ShoeShop shoeShop = Environment.getShoeShop();
			System.out.println(shoeShop.sellShoe());
			System.out.println(shoeShop.getShoefactory());
	}
}
