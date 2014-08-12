package com.dpattern.icecream;

public class Nuts extends Item {
	MakingMoney mm;

	Nuts(MakingMoney mm) {
		this.mm = mm;
	}

	@Override
	public int cost() {
		return 5 + mm.cost();
	}
}
