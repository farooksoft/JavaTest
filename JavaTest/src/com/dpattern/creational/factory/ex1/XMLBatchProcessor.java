package com.dpattern.creational.factory.ex1;

public class XMLBatchProcessor extends BatchProcessor {

	@Override
	public IParser createParser(String string) {
		System.out.println("XML Batch processor : " + string);
		return null;
	}

}
