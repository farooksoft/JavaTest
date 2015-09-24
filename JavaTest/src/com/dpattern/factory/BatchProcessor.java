package com.dpattern.factory;

public abstract class BatchProcessor {

	public void processBatch(String string) {
		
		IParser parser = createParser(string);
		parser.process(string);
		
	}
	
	//FACTORY METHOD
	public abstract IParser createParser(String string);

}
