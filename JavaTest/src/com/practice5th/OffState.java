package com.practice5th;

public class OffState extends State {
public void pull(Fan f)
{
	f.setState(new SwitchOnState());
	System.out.println("Fan is in off state");
}
}
