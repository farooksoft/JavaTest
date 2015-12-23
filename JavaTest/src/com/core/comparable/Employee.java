package com.core.comparable;

public class Employee implements Comparable<Employee>{
	
	private int empId;
	private String empName;
	private String designation;
	
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return this.empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return this.empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return this.designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public int compareTo(Employee o) {
		
		if(this.empId < o.empId){
			return 1;
		} else if(this.empId > o.empId){
			return -1;
		}		
		return 0;
	}
	
}