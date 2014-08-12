package com.dpattern.businessdelegate;

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
