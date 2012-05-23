package com.practice5th;

public class FullSpeedState extends State {
public void pull(Fan f)
{
	f.setState(new OffState());
	System.out.println("going to switch off");
}
}
