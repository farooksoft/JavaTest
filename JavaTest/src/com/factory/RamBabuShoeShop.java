package com.factory;

public class RamBabuShoeShop extends ShoeShop{
	
@Override
public Shoe getShoe() {
	return getShoefactory().makeShoe();
}
@Override
	public Shoe sellShoe() {
		return getShoe();
	}
}
