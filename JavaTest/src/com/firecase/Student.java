package com.firecase;

	import java.util.Observable;
import java.util.Observer;

	public class Student implements Observer  {

		public void update(Observable arg0, Object arg1) {
			challo((String)arg1);
		}
		
		public void challo(String msg)
		{
			System.out.println("student is running" +msg);
		}
	}


