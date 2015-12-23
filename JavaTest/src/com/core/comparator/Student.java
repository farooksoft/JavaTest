package com.core.comparator;

public class Student {
	
	private int studentId;
	private String studentName;
	private String stundentClass;
	
	public Student(int stuId, String stuName, String stuClass) {
		this.studentId = stuId;
		this.studentName = stuName;
		this.stundentClass = stuClass;
	}
	
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the stundentClass
	 */
	public String getStundentClass() {
		return stundentClass;
	}
	/**
	 * @param stundentClass the stundentClass to set
	 */
	public void setStundentClass(String stundentClass) {
		this.stundentClass = stundentClass;
	}
	
	
}
