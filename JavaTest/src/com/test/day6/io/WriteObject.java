package com.test.day6.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) throws Exception{
		Student student = new Student();
		student.setAge(23);
		student.setName("srinath"); 
		
		FileOutputStream fos = new FileOutputStream("emp.dat");
		ObjectOutputStream outputStream = new ObjectOutputStream(fos);
		outputStream.writeObject(student);
	}
}
