package com.dpattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements IInternet{

	IInternet internet = new RealInternet();
	static List<String> list = new ArrayList<String>();
	
	static{
		list.add("site1");
		list.add("site2");
		list.add("virus.com");
		list.add("site4");
	}
	
	@Override
	public void connectTo(String site) {
		if(!list.contains(site)){
			internet.connectTo(site);
		} else{
			System.out.println("Cann't connect to bad site:" + site);
		}
	}
}