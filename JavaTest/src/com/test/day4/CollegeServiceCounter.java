package com.test.day4;

public class CollegeServiceCounter implements ServiceCounter{
	RevenueDept dept; EducationDept dept2;
	public CollegeServiceCounter(RevenueDept dept, EducationDept dept2) {
		this.dept = dept;
		this.dept2 = dept2;
	}
	public void execute(){
		dept.getRevenueClearance();
		dept2.getEducationDeptClearance();
	}

}
