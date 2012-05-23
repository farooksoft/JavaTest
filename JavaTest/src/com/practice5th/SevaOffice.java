package com.practice5th;

public class SevaOffice {
	 
	sevacounter[] sc=new sevacounter[5];
   public SevaOffice()
    {
	  for(int i=0;i<sc.length;i++)
	 
	  {
		sc[i]=new DummyCounter();  
	    }
      }
  
  public void setCounter(sevacounter sevacount,int slot)
   {
	  sc[slot]=sevacount;
     }
    
  public void useCounter(int slot)
   {
	  sc[slot].execute();
     }
  
  
}
