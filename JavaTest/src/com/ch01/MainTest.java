package com.ch01;

import java.util.HashSet;
import java.util.Iterator;

public class MainTest {
		
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(1);
		hashSet.add(1);
		
		Iterator<Integer> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}