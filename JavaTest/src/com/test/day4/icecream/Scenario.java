package com.test.day4.icecream;

public class Scenario {
public static void main(String[] args) {
	MoneyMaking mm=new RichMan();
	
	System.out.println("RichMans cost:"+mm.cost());
	
	mm=new Vanilla(mm);
		
	System.out.println("Compo of RM + Vanilla:"+mm.cost());
	
	mm=new Vanilla(mm);
	mm=new Nuts(mm);
	mm=new Fruits(mm);
	
	System.out.println("Compo of RM + 2Vanilla +1Nut+1Fruit:"+mm.cost());

}
}
