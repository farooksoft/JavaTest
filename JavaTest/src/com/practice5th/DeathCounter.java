package com.practice5th;

public class DeathCounter implements sevacounter{
 
	Hospital h;
	Police p;
	Corporation c;
	
	public DeathCounter(Hospital h,Police p,Corporation c)
	{
	    this.h=h;
	    this.p=p;
	    this.c=c;
			}
	public void execute()
 {
	h.giveDeathClearance();
	p.doInvestigation();
	c.giveDeathClearance();
 }
}
