package com.firecase;

public class Scenario {
public static void main(String[] args) {
	FireAlarm fa=new FireAlarm();
	Student valtech=new Student();
	Teacher t=new Teacher();
	fa.addObserver(valtech);
	fa.addObserver(t);
	
	fa.FireAlarm();
}
}
