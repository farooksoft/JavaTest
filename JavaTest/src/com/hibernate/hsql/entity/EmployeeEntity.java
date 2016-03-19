package com.hibernate.hsql.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name="Employee", uniqueConstraints={@UniqueConstraint(columnNames="ID"), @UniqueConstraint(columnNames="EMAIL")})
public class EmployeeEntity implements Serializable {

	/**
	 * default serial version UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID", unique=true, nullable=false)
	private Integer employeeId;
	
	@Column(name = "EMAIL", unique = true, nullable = false, length = 100)
	private String email;
	
	@Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
	private String firstName;
	   
	@Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
	private String lastName;

	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return this.employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}