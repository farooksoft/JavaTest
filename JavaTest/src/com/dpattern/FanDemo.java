package com.dpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FanDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Fan bajaj = new Fan();

		while (true) {
			System.out.println("Please Pull...");
			reader.readLine();
			bajaj.pull();
		}
	}
}
