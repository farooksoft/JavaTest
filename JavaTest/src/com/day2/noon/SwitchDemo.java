package com.day2.noon;

public class SwitchDemo {
  public static void main(String[] args) {
	int i=Integer.parseInt(args[0]);
	switch(i)
	{
       case 100:
       {
		System.out.println("100 value passed");
	    break;
	   }
	   case 99:
			{
			System.out.println("99 value");
			break;
		    }
	    default:
				{
					System.out.println("default getting passed");
				}
	 }
  }
}
