package com.puzzles.hackerrank.codewhiz.mar16;

import java.util.Scanner;

public class ServeTheStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalEvents = Integer.parseInt(in.nextLine());
		int size = totalEvents;
		Student[] studentArray = new Student[totalEvents];
		Student student;
		
		while (totalEvents > 0) {
			String event = in.next();
			String name = in.next();
			double cgpa = in.nextDouble();
			int token = in.nextInt();
			student = new Student(token, name, cgpa);
			
			if(event.equals("ENTER")){
				studentArray[size - totalEvents] = student;
			} else if(event.equals("SERVED")){				
				for(int i=0; i<(size- totalEvents); i++){					
					Student stud1 = studentArray[i];
					for(int j=i; j<(size- totalEvents); j++){
						Student stud2 = studentArray[j];
						
					}
				}
			}
			
			

			totalEvents--;
		}
	}

}

class Student {
	private int token;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getToken() {
		return token;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}