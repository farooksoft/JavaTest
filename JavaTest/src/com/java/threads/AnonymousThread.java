package com.java.threads;
public class AnonymousThread extends Thread
{
	public static void main(String[] args) 
	{
		Thread t=new Thread()
		{
			public void run()
			{
				for(int i=0;i<10;i++)
     			  System.out.println("i= "+i);
			}
		};
		t.start();
		for(int i=0;i<10;i++)
		  System.out.println("main Thread ="+i);
	}
}
