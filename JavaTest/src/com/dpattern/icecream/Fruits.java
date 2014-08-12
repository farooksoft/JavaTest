package com.dpattern.icecream;

public class Fruits extends Item {
	MakingMoney mm;

	Fruits(MakingMoney mm) {
		this.mm = mm;
	}

	@Override
	public int cost() {
		return 5 + mm.cost();
	}

}
