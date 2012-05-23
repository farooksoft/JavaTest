package com.test.day4;

public class CollegeCertificateDemo {
	public static void main(String[] args) {
		RevenueDept dept = new RevenueDept();
		EducationDept dept2 = new EducationDept();
		
		ServiceOffice office = new ServiceOffice();
		CollegeServiceCounter counter = new CollegeServiceCounter(dept, dept2);
		
		office.setCollegeCounter(counter, 1);
		office.useCollegeCounter(1);
	}
}
