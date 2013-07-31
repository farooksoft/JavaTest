package com.java.threads.one;
class Test 
{
	public static void main(String args[])  throws Exception
	{
		
		Activity a=new Activity();
		Thread t=new Thread(a);
		t.start();
		for(int i=0;i<20;i++)
		System.out.println("MainThread :"+i);
		System.out.println("Exiting Main");
	}
}
