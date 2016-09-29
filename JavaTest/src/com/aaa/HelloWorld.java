package com.aaa;

import java.util.Date;

//import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		//Thread thread = new Thread(new Thread1());
		//thread.start();
		try{
        	Thread.currentThread().sleep(30000);
        }catch(InterruptedException inex) {
        	System.out.println(inex);
//        	continue;
        }
	}
	
}

class Thread1 implements Runnable{

	@Override
	public void run() {
//		System.out.println("Initialized at.." + new Date().toString());
		
		//while(true){
		
			try{
	        	Thread.sleep(30000);
	        }catch(InterruptedException inex) {
	        	System.out.println(inex);
//	        	continue;
	        }
//			System.out.println("Running.." + new Date().toString());
			
			//Thread thread = new Thread(new Thread2());
			//thread.start();
		
		
		}

	 class Thread2 implements Runnable{
		int i = 0;
		public Thread2() {
			// TODO Auto-generated constructor stub
		}
		@Override
		public void run() {
			System.out.println("Thread2 : Sleeping for 15 sec : " + i);
			try{
	        	Thread.sleep(30000);
	        }catch(InterruptedException inex) {
	        	System.out.println(inex);        	
	        }
			System.out.println("Done..");
			i++;
		}
	}
}

