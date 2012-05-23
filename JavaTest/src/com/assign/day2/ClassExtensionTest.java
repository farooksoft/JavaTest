package com.assign.day2;
class Student{
	int rno=1000;
	String name="hello";
}
class Exam extends Student{
	int m1=23;
	int m2=34;
	int m3=45;
	
}
class Result extends Exam{
	int totlaMarks;
	public int calculate()
	{
		return m1+m2+m3;
	}
}

public class ClassExtensionTest{
	public static void main(String[] args) {
		Result r=new Result();
		System.out.println("Student Rolno:"+r.rno);
		System.out.println("Student Name :"+r.name);
		System.out.println("Total Marks  :"+r.calculate());
	}

}
