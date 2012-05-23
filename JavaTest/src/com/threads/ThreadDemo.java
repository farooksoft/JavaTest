package com.threads;

public class ThreadDemo {
  
	public void firstMethod()
	{
	  for(int i=0;i<5;i++)
	   {
		  System.out.println(i);
		  try{
			  Thread.sleep(1000);
			   }
		  catch(InterruptedException ie){}
	     }
	}
  
	 public void secondMethod()
	 {
		 System.out.println("i am samba \n i am samba\n i am samba");
	 }
  
	 public static void main(String[] args) {
		 ThreadDemo obj=new ThreadDemo();
		 new childThread(obj);
		 obj.firstMethod();
	 }
 }

class childThread implements Runnable
{
	Thread t;
	ThreadDemo obj;

	public childThread(ThreadDemo obj)
	{	
		this.obj=obj;
		t=new Thread(this);
		t.start();
    }

   public void run()
   {
	   obj.secondMethod();
   }
}



