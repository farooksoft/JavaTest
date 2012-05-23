package com.test.cfwork; 

import java.util.*;
/**
 * Using Iterater()
 */
class IteraterDemo	{
	public static void main(String[] args)		{
		// Creating ArrayList
		ArrayList<String> al=new ArrayList<String>();
		// Adding elements to ArrayList
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		System.out.println("Values of ArrayList When inserted : "+al);
		// Calling Iterator 
		Iterator itr=al.iterator();
		while(itr.hasNext())	{
			Object obj=itr.next();
			System.out.println("Elements are :"+obj);	// Printing elements using Iterater
		}
		System.out.println("\n");		
			// Modifying Objects in ArrayList
			ListIterator<String> litr=al.listIterator();
			while(litr.hasNext())	{
				Object obj=litr.next();
				litr.set(obj+"+");
			}
			// Now, printing modified elements
			System.out.println("Elements are :");
			itr=al.iterator();
			while(itr.hasNext())	{
			Object obj=itr.next();
			System.out.print(obj);	// Printing modified elements using Iterater
			}		
			System.out.println("\n");
			// Printing elements of Array from Back
			System.out.println("Elements are :");
			while(litr.hasPrevious())	{
			Object obj=litr.previous();
			System.out.print(obj);	// Printing modified elements using Iterater
			}
		}
	}

