package com.dpattern.creational.factory.ex2;

public class CurrencyFactory{

	public static ICurrency getCurrencyByCountry(String countryName){
		
		if(countryName.equalsIgnoreCase("india")){
			return new IndiaCurrencyImpl();
		} else if(countryName.equalsIgnoreCase("us")){
			return new USCurrencyImpl();
		}
		return null;
	}
}