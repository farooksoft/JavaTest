package com.day3.morning;

public class InterfaceDemo {
 public static void main(String[] args) {
   	  Human h=new Human();                    
      h.teach();
      h.teachDance();
 }
}


class Human implements Teacher,DanceTeacher,JavaTeacher
{
	public void teach()
	{
		System.out.println("teach method called");
	}
	
	public void teachJava()
	{
		System.out.println("teach java method called");
	}
	
	public void teachDance()
	{
		System.out.println("teach dance method called");
	}

	
}

interface Teacher
{
	public void teach();
}
interface JavaTeacher extends Teacher
{
	public void teachJava();
  }

interface DanceTeacher extends Teacher
{
	public void teachDance();
}

