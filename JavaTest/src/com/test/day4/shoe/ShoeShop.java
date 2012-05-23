package com.test.day4.shoe;

public abstract class ShoeShop {
	private ShoeFactory shoefactory;
	
	public abstract Shoe getShoe();
	public abstract Shoe sellShoe();
	
	public void setShoefactory(ShoeFactory shoefactory) {
		this.shoefactory = shoefactory;
	}
	public ShoeFactory getShoefactory(){
		return shoefactory;
	}

}
