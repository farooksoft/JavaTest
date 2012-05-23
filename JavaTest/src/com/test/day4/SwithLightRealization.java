package com.test.day4;

/**
 * implementing Bridge pattern
 */
public class SwithLightRealization {

	public static void main(String[] args) {
		Switch switch1 = new Light();
		switch1.on();
		switch1.off();
	}

}
