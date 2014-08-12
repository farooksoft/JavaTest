package com.dpattern.icecream;

public class IceDemo {
	public static void main(String[] args) {
		MakingMoney mm = new Richman();
		System.out.println(mm.cost());
		mm = new Vannila(mm);
		System.out.println("cost for vannila" + mm.cost());
		mm = new Vannila(mm);
		mm = new Fruits(mm);
		mm = new Nuts(mm);
		System.out.println("composite of all" + mm.cost());
	}
}
