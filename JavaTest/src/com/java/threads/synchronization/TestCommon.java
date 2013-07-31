package com.java.threads.synchronization;
public class TestCommon extends Thread
{
	public static void main(String[] args)
	{
	final Common C=new Common();
		
		Thread t1=new Thread()
		{
			public void run()
			{
				C.incrementer();
			}
		};
		//t1.getPriority();
		//t1.setPriority(7);
		t1.start();

		Thread t2=new Thread()
		{
			public void run()
			{
				C.decrementer();
			}
		};
		//t1.getPriority();
		//t1.setPriority(7);
		t2.start();
	}
}


/*



*/