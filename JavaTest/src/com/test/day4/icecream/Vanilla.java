package com.test.day4.icecream;

public class Vanilla extends Item{
	MoneyMaking mm;
	public Vanilla(MoneyMaking mm) {
		// TODO Auto-generated constructor stub
		this.mm=mm;
	} 
@Override
public int cost() {
	// TODO Auto-generated method stub
	return 10+mm.cost();
}
}
