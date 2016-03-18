package com.dpattern.creational.factory.ex1;

public class TextParser implements IParser {

	@Override
	public void process(String string) {
		System.out.println("Text parser parsing!");
	}

}
