package com.hibernate.hsql.test;

import org.hibernate.Session;

import com.hibernate.hsql.entity.EmployeeEntity;
import com.hibernate.hsql.util.HibernateUtil;

public class HibernateTest {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	
		session.beginTransaction();
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEmployeeId(1);
		employeeEntity.setFirstName("srinath");
		employeeEntity.setLastName("rayabarapu");
		employeeEntity.setEmail("naath.r@gmail.com");
		
		session.save(employeeEntity);
		session.getTransaction().commit();
		
		HibernateUtil.shutdown();
		
	}

}
