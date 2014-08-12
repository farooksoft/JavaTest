package com.dpattern.icecream;

public class Vannila extends Item {
	MakingMoney mm;

	Vannila(MakingMoney mm) {
		this.mm = mm;
	}

	@Override
	public int cost() {
		return 5 + mm.cost();
	}

}
