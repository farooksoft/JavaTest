package com.core.comparable;

import org.junit.Assert;
import org.junit.Test;

public class ComparableTest{
	
	Employee employee1 = new Employee();
	Employee employee2 = new Employee();
	
	@Test
	public void testEmployeeComparable1(){
		this.employee1.setEmpId(1);
		this.employee1.setEmpName("abc");
		this.employee1.setDesignation("worker");
		
		this.employee2.setEmpId(1);
		this.employee2.setEmpName("abc");
		this.employee2.setDesignation("worker");
		
		Assert.assertEquals(0, this.employee1.compareTo(this.employee2));
		
	}
	
	@Test
	public void testEmployeeComparable2(){
		this.employee1.setEmpId(1);
		this.employee1.setEmpName("abc");
		this.employee1.setDesignation("worker");
		
		this.employee2.setEmpId(1);
		this.employee2.setEmpName("abc");
		this.employee2.setDesignation("worker");
		
		Assert.assertEquals(0, this.employee1.compareTo(this.employee2));
		
	}

}
