package com.assign.day3;

import java.io.IOException;

public class GetHumanCloneDemo {
	public static void main(String[] args) throws IOException {
		Human human = new Human();
		Human human2 = (Human)human.getClone();
		human.name = "Srinath";
		human2.name = "small srinath";
		System.out.println(human.name);
		System.out.println(human2.name);
		
		/*
		 * clone share resources check
		 */
		System.out.println(human.inputStream.available());
		human.inputStream.close();
		
		System.out.println(human2.inputStream.available());
	}
}
