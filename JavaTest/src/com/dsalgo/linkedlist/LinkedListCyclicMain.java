package com.dsalgo.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * class to check whether a linked list is cyclic or not<p>
 * logic:
 * 	1) Use two pointers fast and slow
	2) Move fast two nodes and slow one node in each iteration
	3) If fast and slow meet then linked list contains cycle
	4) if fast points to null or fast.next points to null then linked list is not cyclic
 * 
 * @author srayabar
 *
 */
public class LinkedListCyclicMain {

	public static void main(String[] args) {
		
		List<String> testList = new LinkedList<String>();
		
		testList.add("abc");
		testList.add("abc1");
		testList.add("abc2");
		testList.add("abc");
		
		
		
	}

}
