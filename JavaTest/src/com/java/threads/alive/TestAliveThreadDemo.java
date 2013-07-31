package com.java.threads.alive;
class TestAliveThreadDemo 
{
	public static void main(String[] args) 
	{
		AliveThreadDemo a=new AliveThreadDemo();
		Thread t1=new Thread(a);
		System.out.println("ChildThread is Alive "+t1.isAlive());
		t1.start();
		System.out.println("ChildThread is Alive "+t1.isAlive());

		for(int i = 0 ; i < 10 ; i++)
		{
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
		System.out.println("Main " + i);		
		}
		System.out.println("ChildThread is Alive "+t1.isAlive());
		System.out.println("Exiting Main()");
	}
}
