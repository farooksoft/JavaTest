package com.test;

public class SwitchDemo {
	public static void main(String[] args) 
	{
     int i=Integer.parseInt(args[0]);
     switch(i)
     {
     case 99:
    	 System.out.println("99 passed...");
    	 break;
     case 100:
    	 System.out.println("100 passed...");
    	 break;
    	 default:
    		 System.out.println("default getting called");
    	 
     }
	
	}

}
