package com.dpattern.creational.factory.ex1;

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