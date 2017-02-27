package com.dpattern.creational.factory.ex2;

public class USCurrencyImpl implements ICurrency {

	@Override
	public String getCurrency() {
		return "USD";
	}

	@Override
	public String getSymbol() {
		return "$";
	}
}
