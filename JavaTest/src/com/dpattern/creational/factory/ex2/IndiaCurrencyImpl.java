package com.dpattern.creational.factory.ex2;

public class IndiaCurrencyImpl implements ICurrency {

	@Override
	public String getCurrency() {		
		return "Rupee";
	}

	@Override
	public String getSymbol() {
		return "INR";
	}

}
