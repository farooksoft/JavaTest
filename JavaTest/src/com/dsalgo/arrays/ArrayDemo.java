package com.dsalgo.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args) {
//		testArrays();
		//testAditya();
		
		Object[] objArray = new Object[10];
		
		objArray = new String[11]; // can do this in Arrays
		objArray[10] = new String();
		
		List<Object> objList = new ArrayList<Object>();
		//objArray = new ArrayList<String>(); //cann't do this in List 
		
	}

	private static void testAditya() {
		List<String> al=new ArrayList<String>();
        al.add("2.3.4");
        String string = al.get(0);
        System.out.println(string);
        String[] str=string.split("\\.");
        System.out.println(str[0]);   // GETTING ArrayIndexOutOfBoundsException HERE , WHY SPLIT NOT WORKING PROPERLY
        
        System.out.println(al.get(0).toString());
        
        int len=str.length;
        System.out.println("length is:"+len);
	}

	private static void testArrays() {
		int[] a = new int[3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}