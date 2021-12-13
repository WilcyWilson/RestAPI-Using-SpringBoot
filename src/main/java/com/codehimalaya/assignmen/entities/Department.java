package com.codehimalaya.assignmen.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Department {
	@Id
	private int departmentId;
	private String name;
	
//	@OneToMany(mappedBy="department")
//	private Set<Employee> employees;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentId, String name) {
		super();
		this.departmentId = departmentId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", name=" + name + "]";
	}

}
