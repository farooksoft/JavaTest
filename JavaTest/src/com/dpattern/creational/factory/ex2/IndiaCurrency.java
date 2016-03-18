package com.dpattern.creational.factory.ex2;

public class IndiaCurrency implements Currency {

	@Override
	public String getCurrency() {		
		return "Rupee";
	}

	@Override
	public String getSymbol() {
		return "INR";
	}

}
