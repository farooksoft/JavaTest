package com.dpattern.creational.factory.ex2;

public class FactoryPatternMain {
	
	public static void main(String[] args) {
		Currency currencyByCountry = CurrencyFactory.getCurrencyByCountry("india");
		System.out.println("Country Currency - " + currencyByCountry.getCurrency());
		System.out.println("Country Symbol - " + currencyByCountry.getSymbol());
	}
}

/**
 * 1. Have an Interface with base methods <br>
 * 2. Let two classes implement them <br>
 * 3. Have a factory class which has a static method to return concrete classes depending on input parameter<br>
 * 4. test it in a demo main class<br>
 * 
 * @author srayabar
 *
 */
class CurrencyFactory{

	public static Currency getCurrencyByCountry(String countryName){
		
		if(countryName.equalsIgnoreCase("india")){
			return new IndiaCurrency();
		} else if(countryName.equalsIgnoreCase("us")){
			return new USCurrency();
		}
		return null;
	}
}