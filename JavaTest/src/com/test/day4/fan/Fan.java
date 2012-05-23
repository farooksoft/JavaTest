package com.test.day4.fan;

public class Fan{
	State state = new OffState(); 
	void pull(){
		state.pull(this);
	}
	void setState(State state){
		this.state = state;
	}
}