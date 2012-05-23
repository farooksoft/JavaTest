package com.test.day4.shoe;

import java.io.FileInputStream; 
import java.util.Properties;

public class Environment {

	public static ShoeShop getShoeShop(){
		try{
		Properties properties = new Properties();
		properties.load(new FileInputStream("Properties.properties"));
		String factory = properties.getProperty("factory");
		String shoeshope = properties.getProperty("shoeshope");
		
		ShoeFactory shoeFactory = (ShoeFactory)Class.forName(factory).newInstance();
		ShoeShop shoeShope = (ShoeShop)Class.forName(shoeshope).newInstance();
		
		shoeShope.setShoefactory(shoeFactory);
		return shoeShope;
		}catch(Exception exception){
			return null;
		}
	}
}
