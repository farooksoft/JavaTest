package com.core.collections;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapMain {

	public static void main(String[] args) {
		Map<Demo, Integer> weakMap = new WeakHashMap<Demo, Integer>();
		
		weakMap.put(new Demo(10, 5), 100);//weak references, will get GC'd
		weakMap.put(new Demo(5, 10), 200);//weak references, will get GC'd
		
		Demo demo = new Demo(10, 10);
		weakMap.put(demo, 300);//strong reference, will not GC'd
		
		System.out.println("Before : " + weakMap.size());
		
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		
		System.out.println("After : " + weakMap.size()); //no guarantee GC would run but if runs then the size is 1
	}

}

class Demo{
	int x;
	int y;
	public Demo(int x, int y) {
		this.x = x;
		this.y = y;
	}
}