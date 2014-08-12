package com.dpattern.factory;

public abstract class ShoeShop {
	private ShoeFactory shoefactory;

	public abstract Shoe getShoe();

	public abstract Shoe sellShoe();

	public ShoeFactory getShoefactory() {
		return shoefactory;
	}

	public void setShoefactory(ShoeFactory shoefactory) {
		this.shoefactory = shoefactory;
	}
}
