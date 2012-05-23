package com.practice5th;

public class MediumSpeedState extends State {
public void pull(Fan f)
{
	f.setState(new FullSpeedState());
	System.out.println("Full speed state");
}
}
