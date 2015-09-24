package com.dpattern.factory;

public class CSVBatchProcessor extends BatchProcessor {

	@Override
	public IParser createParser(String string) {
		System.out.println("CSV Batch processor : " + string);
		return null;
	}

}
