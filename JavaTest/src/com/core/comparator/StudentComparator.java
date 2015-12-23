package com.core.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentComparator {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "abc", "6"));
		students.add(new Student(2, "bca", "2"));
		students.add(new Student(4, "abc", "1"));
		
		// creating a comparator from interface itself
		Collections.sort(students, studentComparator);		
		for(Student student : students){
			System.out.println(student.getStudentId());
		}
		System.out.println("");
		
		// creating a comparator out of a class
		Collections.sort(students, new StudentClassComparator());
		for(Student student : students){
			System.out.println(student.getStudentId());
		}
		System.out.println("");
		
		// we can define comparator to a treeset to sort its elements
		Set<Student> treeSet = new TreeSet<Student>(new StudentClassComparator());
		treeSet.add(new Student(1, "abc", "6"));
		treeSet.add(new Student(2, "bca", "2"));
		treeSet.add(new Student(4, "abc", "1"));
		
		for(Student student : treeSet){
			System.out.println(student.getStudentId());
		}
		System.out.println("");
		
	}
	
	static Comparator<Student> studentComparator = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			
			if(o1.getStudentId() > o2.getStudentId()){
				return 1;
			} else if(o1.getStudentId() < o2.getStudentId()){
				return -1;
			}
			return 0;
		}
	};
	
}

class StudentClassComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getStudentId() < o2.getStudentId()){
			return 1;
		} else if(o1.getStudentId() > o2.getStudentId()){
			return -1;
		}
		return 0;
	}
}