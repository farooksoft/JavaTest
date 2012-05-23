package com.factory;

public class Scenario {
public static void main(String[] args){
	ShoeShop shop=Environment.getShoeShop();
	System.out.println(shop.sellShoe());
	System.out.println(shop.getShoefactory());
} 

}
