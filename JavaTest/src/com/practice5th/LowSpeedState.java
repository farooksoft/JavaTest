package com.practice5th;

public class LowSpeedState extends State {
public void pull(Fan f)
{
	f.setState(new MediumSpeedState());
	System.out.println("medium speed state");
}
}
