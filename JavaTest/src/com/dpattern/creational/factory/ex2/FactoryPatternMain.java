package com.dpattern.creational.factory.ex2;

/**
 * ** static factory class implementation **
 * 
 * 1. Have an Interface with base methods <br>
 * 2. Let two classes implement them <br>
 * 3. Have a factory class which has a static method to return concrete classes depending on input parameter<br>
 * 4. in a demo main class, call the factory static method<br>
 * 
 * @author srayabar
 *
 */
public class FactoryPatternMain {
	
	public static void main(String[] args) {
		ICurrency currencyByCountry = CurrencyFactory.getCurrencyByCountry("india");
		System.out.println("Country Currency - " + currencyByCountry.getCurrency());
		System.out.println("Country Symbol - " + currencyByCountry.getSymbol());
		
		currencyByCountry = CurrencyFactory.getCurrencyByCountry("US");
		System.out.println("Country Currency - " + currencyByCountry.getCurrency());
		System.out.println("Country Symbol - " + currencyByCountry.getSymbol());
	}
}
