package com.day2.noon;

public class AccessSpecifierDemo {
  
	private int pri;
	int nomod;
	public int pub;
	protected int pro;
	
	public void met()
	{
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pub);
		System.out.println(pro);
    	}
}
     class subAccess extends AccessSpecifierDemo
     {
    	 public void met()
    		{
//    			System.out.println(pri);
    			System.out.println(nomod);
    			System.out.println(pub);
    			System.out.println(pro);
    	    	}
    	     
          }
	
     class SamePack 
     {
    	 public void met()
 		{
 			AccessSpecifierDemo obj=new AccessSpecifierDemo();
//    		System.out.println(obj.pri);
 			System.out.println(obj.nomod);
 			System.out.println(obj.pub);
 			System.out.println(obj.pro);
 	    	}
 	 
     }
