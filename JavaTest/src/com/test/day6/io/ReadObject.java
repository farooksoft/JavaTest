package com.test.day6.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("emp.dat");
		ObjectInputStream inputStream = new ObjectInputStream(fis);
		System.out.println(inputStream.readObject());
	}
}
