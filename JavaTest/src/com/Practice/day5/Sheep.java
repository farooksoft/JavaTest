package com.Practice.day5;

import java.io.FileInputStream;

public class Sheep implements Cloneable{
 String name;//primitive property
 FileInputStream fis;
 public Sheep() {
  try{
	  fis=new FileInputStream("E:/Lesson1.txt");
      }catch(Exception e)
      {
    	  System.out.println("Filenot found exception");
      }
 }
 public Object getClone()
 {
	 try{
		 return super.clone();
	 }catch(Exception e)
	 {
		 return null;
	  }
   }
}

