package com.dpattern.factory;

public class XMLBatchProcessor extends BatchProcessor {

	@Override
	public IParser createParser(String string) {
		System.out.println("XML Batch processor : " + string);
		return null;
	}

}
