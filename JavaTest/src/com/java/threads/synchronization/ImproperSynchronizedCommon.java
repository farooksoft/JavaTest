package com.java.threads.synchronization;
public class ImproperSynchronizedCommon 
{
	int counter;
	
	public synchronized  void incrementer() 
	{
		while(true)
		{
			counter++;
			System.out.println("Counter in Incremeter= "+counter);
			if(counter==100)
				break;
		}
	}

	public  void decrementer() 
	{
		while(true)
		{
			counter--;
			System.out.println("Counter in decremeter= "+counter);
			if(counter==-10)
				break;
		}
	}

	
}
