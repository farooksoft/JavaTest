package com.dpattern.factory;

public class TextParser implements IParser {

	@Override
	public void process(String string) {
		System.out.println("Text parser parsing!");
	}

}
