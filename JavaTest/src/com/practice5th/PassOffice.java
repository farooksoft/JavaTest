package com.practice5th;

public class PassOffice {
	PassCounter[] pa=new PassCounter[5];

	public void PassOffice()
	{
		for(int i=0;i<pa.length;i++)
		{
			pa[i]=new PassDummy();
		}
	}
	
	public void setCounter(PassCounter pc,int slot)
	{
		pa[slot]=pc;
	}
	
	public void useCounter(int slot)
	{
		pa[slot].execute();
	}
}
