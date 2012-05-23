package com.factory;

import java.io.FileInputStream;
import java.util.Properties;

public class Environment {
    public static ShoeShop getShoeShop()
    {
	try{
		Properties p=new Properties();
		p.load(new FileInputStream("config.properties"));
		String factory=p.getProperty("factory");
		String shop=p.getProperty("shop");
		ShoeFactory shoefactory
		=(ShoeFactory)Class.forName(factory).newInstance();
		ShoeShop shoeshop
		=(ShoeShop)Class.forName(shop).newInstance();
		shoeshop.setShoefactory(shoefactory);
	    return shoeshop;
	 	 }catch(Exception e)
	 	 {
	 		 e.printStackTrace();
	 		 return null;
	 	  }
       }
}

