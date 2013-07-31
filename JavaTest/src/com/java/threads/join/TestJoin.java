package com.java.threads.join;
class TestJoin 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Operation1());
		Thread t2=new Thread(new Operation2());
		t1.start();
		t2.start();
		try
		{
			/*t1.join();
			t2.join();*/
		}
		catch (Exception e)
		{
			System.out.println("Exception");
		}
		System.out.println("ExitingMain");
		
	}
}
