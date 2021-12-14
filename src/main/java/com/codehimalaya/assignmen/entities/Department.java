package com.codehimalaya.assignmen.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Department {
	@Id
	private int departmentId;
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy="department")
	private Set<Employee> employees = new HashSet<>();

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
	
	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
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
