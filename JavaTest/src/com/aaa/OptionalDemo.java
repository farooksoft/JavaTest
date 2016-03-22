package com.aaa;

import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		Optional<List<student>> studentsListOptional = fetchStudentsList();
		
		//mandatory check
		if(studentsListOptional.isPresent()){
			List<student> list = studentsListOptional.get();
			
			System.out.println("students size : " + list.size());
		}
	}

	private static Optional<List<student>> fetchStudentsList() {
		
		//from db
		List<student> studsList = null;//new ArrayList<student>();
		//studsList.add(null);
		
		return Optional.ofNullable(studsList);
	}
}

class student{
	
}
