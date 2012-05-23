package com.practice5th;

public class Fan {
    State s = new OffState();
	public void pull()
	{
		s.pull(this);
	}
	public void setState(State state) {
		this.s = state;
		
	}
}
