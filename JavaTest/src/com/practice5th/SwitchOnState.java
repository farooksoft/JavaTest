package com.practice5th;

public class SwitchOnState extends State{
public void pull(Fan f)
{
	f.setState(new LowSpeedState());
	System.out.println("low speed state");
}
}
