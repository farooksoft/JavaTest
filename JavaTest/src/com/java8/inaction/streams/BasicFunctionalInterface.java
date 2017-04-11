package com.java8.inaction.streams;
/**
 * demonstrates basic lambda behaviour
 * 
 * @author srayabar
 *
 */
public class BasicFunctionalInterface {
	
	public static void main(String[] args) {
		
		//using lambda
		Runnable rble1 = () -> System.out.println("Hello World1");
		
		//anonymous class
		Runnable rble2 = new Runnable() {			
			@Override
			public void run() {
				System.out.println("Hello World2");
			}
		};
		
		process(rble1);
		process(rble2);
		//direct passing lambda
		process(() -> System.out.print("Hello World3"));
	}
	
	public static void process(Runnable r){
		r.run();
	}
	
}
