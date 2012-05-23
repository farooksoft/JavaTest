package com.exam;

public class Order {
int n;
synchronized int get()
{
	System.out.println("got:" +n);
	return n;
}
synchronized void put(int n)
{
	this.n=n;
	System.out.println("Put:" +n);
}
}
