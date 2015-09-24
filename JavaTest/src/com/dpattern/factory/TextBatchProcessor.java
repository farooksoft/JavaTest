package com.dpattern.factory;

public class TextBatchProcessor extends BatchProcessor {

	@Override
	public IParser createParser(String string) {
		System.out.println("Text Batch processor : " + string); 
		return new TextParser();
	}

}
