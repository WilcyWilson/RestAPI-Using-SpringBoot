package com.codehimalaya.assignmen.entities;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Employee {
	@Id
	private int employeeId;
	private String name;
	
//	@ManyToOne
//	private Department department;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

}
