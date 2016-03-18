package com.dpattern.creational.factory.ex2;

public class USCurrency implements Currency {

	@Override
	public String getCurrency() {
		return "USD";
	}

	@Override
	public String getSymbol() {
		return "$";
	}
}
