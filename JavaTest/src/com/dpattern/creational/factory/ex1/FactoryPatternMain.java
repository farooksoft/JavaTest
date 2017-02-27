package com.dpattern.creational.factory.ex1;

/**
 * ** static factory method implementation **
 * 
 * 1. Have an abstract class with abstract method and concrete methods <br>
 * 2. Let other classes extend this abstract class and implement abstract method <br>
 * 3. Create a main class and write a factory method where you create instances of concrete classes depending on input parameter <br>
 * 4. Call factory method from your main class
 * 
 * @author srayabar
 *
 */
public class FactoryPatternMain {
	
	public static void main(String[] args) {
		
		BatchProcessor batchProcessor = createBatchProcessor("text");
		batchProcessor.processBatch("file");
		System.out.println("Done!!");
	}

	private static BatchProcessor createBatchProcessor(String args) {
		
		/*
		 * this is called STATIC factory
		 */
		if(args.equals("text")){
			return new TextBatchProcessor();
		}
		if(args.equals("csv")){
			return new CSVBatchProcessor();
		}
		if(args.equals("xml")){
			return new XMLBatchProcessor();
		}
		return null;
	}

}