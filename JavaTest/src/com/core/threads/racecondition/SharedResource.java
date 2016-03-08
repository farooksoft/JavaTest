package com.core.threads.racecondition;

public class SharedResource {
	
	static SharedResource resource;
	static int i = 0;
	
	public static SharedResource getInstance(){		
		if(resource == null){
			i++;
			resource = new SharedResource();
			return resource;
		}
		return resource;
	}
	
	@Override
	public String toString() {
		return i+"";
	}
	
}