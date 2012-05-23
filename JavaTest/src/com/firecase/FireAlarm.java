package com.firecase;

import java.util.Observable;

public class FireAlarm extends Observable  {
	public void FireAlarm()
	{
    setChanged();
    notifyObservers("fire in rambabu home run run");
	}
}
