package com.java.threads.one;
class TestCommon1 
{
	public static void main(String[] args) 
	{
		Common1 c=new Common1();
		Activity1Common1 a1=new Activity1Common1();
		Activity2Common1 a2=new Activity2Common1();
		Thread t1=new Thread(a1);
		t1.start();
		Thread t2=new Thread(a2);
		t2.start();
	}
}
