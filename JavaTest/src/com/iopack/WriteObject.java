package com.iopack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
public static void main(String[] args) throws IOException {
	Employee emp=new Employee();
	emp.setName("samba");
	emp.setAge("24");
	FileOutputStream fos=new FileOutputStream("emp.dat");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(emp);
}
}
