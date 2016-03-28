package com.core.collections.iterators;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap, CopyOnWriteArrayList etc
 * 
 * @author srayabar
 */
public class FailSafeIteratorDemo {
	
	public static void main(String[] args) {
		
		//Note: Map interface doesn't maintain the order of insertion
		Map<String, String> tempMap = new ConcurrentHashMap<String, String>();
		tempMap.put("abc", "abc");
		tempMap.put("abc1", "abc1");
		tempMap.put("abc2", "abc2");
		
		Iterator<Entry<String, String>> iterator = tempMap.entrySet().iterator();
		while(iterator.hasNext()){
			tempMap.put("abc4", "abc4");
			System.out.println(iterator.next());//iterator is OK with changes
		}
	}
}