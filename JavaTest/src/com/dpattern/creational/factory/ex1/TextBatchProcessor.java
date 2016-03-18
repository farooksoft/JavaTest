package com.dpattern.creational.factory.ex1;

public class TextBatchProcessor extends BatchProcessor {

	@Override
	public IParser createParser(String string) {
		System.out.println("Text Batch processor : " + string); 
		return new TextParser();
	}

}
