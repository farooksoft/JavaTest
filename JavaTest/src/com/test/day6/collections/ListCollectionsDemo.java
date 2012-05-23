package com.test.day6.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;
import com.test.day4.Hospital;

public class ListCollectionsDemo {

	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		Vector<String> vector = new Vector<String>();
		
		list.add("string");
		list.add(new Integer(454545));
		list.add(new Hospital());
		
		Iterator iterator;
		ListIterator listIterator;
		Enumeration enumeration;
		
		iterator = list.iterator();
		listIterator = list.listIterator();
		enumeration = vector.elements();
		
		// forward direction only
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

//		// bi directional 
//		while(listIterator.hasNext()){
//			System.out.println(listIterator.previous());
//		}
		
		vector.add("added later");
		
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
		}	
	}
}
