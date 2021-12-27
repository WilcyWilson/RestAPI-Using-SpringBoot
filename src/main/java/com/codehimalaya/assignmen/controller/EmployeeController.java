package com.codehimalaya.assignmen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.codehimalaya.assignmen.entities.Employee;
import com.codehimalaya.assignmen.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	// 1. List all Employees
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	@GetMapping("/dto")
	public ResponseEntity<Object> getEmployeesUsingDto() {
		return employeeService.getEmployeeData();
	}
	
	// 2. Find Employees By Their Employee Id
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return this.employeeService.getEmployee(id);
	}
	
	
}
