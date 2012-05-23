package com.practice5th;

public class Scenario {
public static void main(String[] args) {
	Hospital h=new Hospital();
	Police p=new Police();
	Corporation c=new Corporation();
	
	SevaOffice seva=new SevaOffice();
	DeathCounter dc=new DeathCounter(h,p,c);
	seva.setCounter(dc, 1);
    seva.useCounter(4);
}
}
