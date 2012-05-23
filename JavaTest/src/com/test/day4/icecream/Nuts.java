package com.test.day4.icecream;

public class Nuts extends Item{
	MoneyMaking mm;
	public Nuts(MoneyMaking mm) {
		// TODO Auto-generated constructor stub
		this.mm=mm;
	}
@Override
public int cost() {
	// TODO Auto-generated method stub
	return 5+mm.cost();
}
}
