package com.java.core.util.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Shuffles an Array and List
 * 
 * @author Sreekanth
 */
public class ShufflingArrayandList {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		System.out
				.println("Please enter how many numbers you want to add to list ");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter " + n + " elements");

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(bufferedReader.readLine()));
		}

		Collections.shuffle(list);
		System.out.println("Before List sort out : " + list);
		Collections.sort(list);
		System.out.println("After List sort out : " + list);
	}
}
