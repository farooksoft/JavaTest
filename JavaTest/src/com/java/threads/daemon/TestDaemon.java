package com.java.threads.daemon;
class TestDaemon 
{
	public static void main(String[] args) 
	{
		DaemonSample d=new DaemonSample();
		Thread t=new Thread(d);
		t.setDaemon(true);
		t.start();
		System.out.println("ExitingMain");
	}
}
