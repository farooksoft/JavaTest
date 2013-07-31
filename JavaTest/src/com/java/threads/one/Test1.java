package com.java.threads.one;
class Test1 
{
	public static void main(String args[])  throws Exception
	{	
		ThreadDemo t=new ThreadDemo();
		t.start();
		for(int i=0;i<20;i++)
		System.out.println("MainThread :"+i);
		System.out.println("Exiting Main");
	}
}
