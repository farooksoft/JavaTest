package com.java.threads.sleep;
class SleepingThread implements Runnable 
{
	public  void run() 
	{
		for(int i=0;i<30;i++)
			{
				//if(i%5==0)
					try
					{
						Thread.sleep(6000);
						System.out.println("Child ");
					}
					catch (InterruptedException ie)
					{
						System.out.println(ie);
					}
				 //else
                   //     System.out.println(i);     
				
				
			}

   }
}
