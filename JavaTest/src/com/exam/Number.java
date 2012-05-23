package com.exam;
class Number
{
private int ctr = 0;
synchronized void cnumber()
{
ctr = 1;
 }
void print()
{
System.out.println("NO :" + ctr);

}
public void start() {
	// TODO Auto-generated method stub
	
}
}
class Num extends Threads
{
  Number NN;
  Num(Number NN)
  {
   this.NN = NN;
   }

public void run()
{
try{
for (int I = 0; I<100; I++)
 {
  Num.cnumber();
  }
}
catch(Exception e)
{
e.printStackTrace();
 }
}


private static void cnumber() {
	// TODO Auto-generated method stub
	
}

public static void main (String args[])
{
Number NN= new Number();
NN.start();
NN.print();
}
}